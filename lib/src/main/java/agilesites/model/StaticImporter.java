package agilesites.model;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import agilesites.Api;
import agilesites.api.Log;
import agilesites.core.tag.AssetTag;
import agilesites.impl.Env;
import agilesites.util.Util;
import COM.FutureTense.Interfaces.ICS;
import COM.FutureTense.Interfaces.IList;

import com.fatwire.assetapi.data.AssetDataManager;
import com.fatwire.assetapi.data.AssetId;
import com.fatwire.assetapi.data.BlobObject;
import com.fatwire.assetapi.data.BlobObjectImpl;
import com.fatwire.assetapi.data.MutableAssetData;
import com.fatwire.system.Session;
import com.fatwire.system.SessionFactory;
import com.openmarket.xcelerate.asset.AssetIdImpl;

/**
 * Imports static assets for a site
 * 
 * @author msciab
 * 
 */
public class StaticImporter {

	private static Log log = Log.getLog(Env.class);
	private String assets;
	private String sitename;

	/**
	 * The static importer for the site
	 * 
	 * @param sitename
	 */
	public StaticImporter(String sitename) {
		this.sitename = sitename;
		assets = "/" + agilesites.core.WCS.normalizeSiteName(sitename) + "/assets.txt";
	}

	Map<String, String> mimeTypeMap = new HashMap<String, String>();

	// load mimetypes
	private void loadMime(ICS ics) {
		String list = Api.tmp();
		StringBuffer sb = new StringBuffer();
		IList res = ics.SQL("mimetype,extension", "select * from mimetype",
				list, -1, false, sb);
		for (int i = 1; i <= res.numRows(); i++) {
			res.moveToRow(i, IList.gotorow);
			try {
				String k = res.getValue("extension");
				String v = res.getValue("mimetype");
				mimeTypeMap.put(k, v);
			} catch (NoSuchFieldException e) {
				e.printStackTrace();
			}
		}
		System.out.println(mimeTypeMap);
	}

	// get the final characters after a given delimiter
	private static String strTail(String full, char delim) {
		int pos = full.lastIndexOf(delim);
		if (pos == -1)
			return full;
		return full.substring(pos + 1);
	}

	private static String strHead(String full, char delim) {
		int pos = full.lastIndexOf(delim);
		if (pos == -1)
			return full;
		return full.substring(0, pos);
	}

	private static String assetName(String filepath, String hash) {
		String ext = strTail(filepath, '.');
		String filename = strTail(filepath.replace(File.separatorChar, '/'),
				'/');
		String basename = strHead(filename, '.');
		return basename + "_" + hash + "." + ext;
	}

	/*
	private static String assetNameTrimmed(String filepath, String hash) {
		String ext = strTail(filepath, '.');
		String filename = strTail(filepath.replace(File.separatorChar, '/'),
				'/');
		String basename = strHead(filename, '.');
		String fullname = basename + "_" + hash + "." + ext;
		int fullnameLen = fullname.length();
		if (fullnameLen < 64)
			return fullname;
		else
			return fullname.substring(fullnameLen - 64, fullnameLen);
	}*/

	private static String assetNameOnly(String filepath) {
		return strTail(filepath.replace(File.separatorChar, '/'), '/');
	}

	private static String assetHashedFilePath(String filepath, String hash) {
		String basedir = strHead(filepath, '/');
		if (basedir.equals(filepath))
			return assetName(filepath, hash);
		return basedir + "/" + assetName(filepath, hash);
	}

	public String setup(ICS ics, String username, String password) {

		loadMime(ics);
		Session session = SessionFactory.getSession(ics);
		AssetDataManager adm = (AssetDataManager) session
				.getManager(AssetDataManager.class.getName());

		// System.out.println("s=" + session);
		// System.out.println("a=" + adm);

		StringBuilder sb = new StringBuilder();
		InputStream is = Util.class.getResourceAsStream(assets);
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		int count = 0;
		try {
			String asset = br.readLine();
			while (asset != null) {
				// sb.append(asset).append("\n");
				byte[] body = readFromClasspath(asset);
				try {
					String md5 = br.readLine();
					String msg = insertOrUpdate(adm, ics, asset, body, md5);
					if (log.trace())
						log.trace(msg);
					++count;
				} catch (Exception ex) {
					ex.printStackTrace();
					log.error(ex, "ERROR");
					sb.append("ERROR for " + asset + ": " + ex.getMessage());
				}
				asset = br.readLine();
			}
		} catch (Exception ex) {
			ex.printStackTrace();
			sb.append("EXCEPTION: " + ex.getMessage());
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				log.error(e, "ERROR");
			}
		}
		sb.append("=== STATICS ===\n");
		sb.append("Imported " + count + " static web assets\n\n");
		return sb.toString();
	}

	private String insertOrUpdate(AssetDataManager adm, ICS ics,
			String filepath, byte[] body, String hash) throws Exception {

		String name = assetNameOnly(filepath);
		// hash + strTail(filepath.replace(File.separatorChar, '/'), '/');
		String hashedFilePath = assetHashedFilePath(filepath, hash);

		System.out.println(name);
		String mime = mimeTypeMap.get(strTail(filepath, '.').toLowerCase());
		if (mime == null)
			mime = "application/octet-stream";
		System.out.println(mime);

		String tmp = Api.tmp();

		// AssetTag.list().list(list).field1("name").value1(asset).type("Static").run(ics);
		AssetTag.load().name(tmp).type("Static").field("FILEPATH")
				.value(filepath).run(ics);
		if (ics.GetObj(tmp) != null) {
			String id = AssetTag.get().field("id").name(tmp)
					.eval(ics, "output");
			System.out.println("found " + id + " for " + filepath);
			AssetId aid = new AssetIdImpl("Static", Long.parseLong(id));
			MutableAssetData data = adm.readForUpdate(Arrays.asList(aid))
					.iterator().next();
			data.getAttributeData("name").setData(name);
			data.getAttributeData("mimetype").setData(mime);
			data.getAttributeData("hashfilepath").setData(hashedFilePath);
			BlobObject blob = new BlobObjectImpl(name, "Static", body);
			data.getAttributeData("url").setData(blob);
			data.getAttributeData("hash").setData(hash);
			adm.update(Util.listData(data));
			// System.out.println(Util.dumpAssetData(data));
		} else {
			System.out.println("not found " + name);
			MutableAssetData data = adm.newAssetData("Static", "");
			String id = ics.genID(true);
			AssetId aid = new AssetIdImpl("Static", Long.parseLong(id));
			data.setAssetId(aid);
			data.getAttributeData("Publist").setData(Arrays.asList(sitename));
			data.getAttributeData("name").setData(name);
			data.getAttributeData("filepath").setData(filepath);
			data.getAttributeData("hashfilepath").setData(hashedFilePath);
			data.getAttributeData("hash").setData(hash);
			data.getAttributeData("mimetype").setData(mime);
			BlobObject blob = new BlobObjectImpl(name, "Static", body);
			data.getAttributeData("url").setData(blob);
			adm.insert(Util.listData(data));
			System.out.println(name);
		}
		return name + " (" + filepath + ")";
	}

	private byte[] readFromClasspath(String asset) throws IOException {
		InputStream in = null;
		try {
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			in = getClass().getResourceAsStream(asset);
			int c = in.read();
			while (c != -1) {
				baos.write(c);
				c = in.read();
			}
			return baos.toByteArray();
		} catch (IOException e) {
			log.error(e, "ERROR");
			return null;
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
					log.error(e, "ERROR");
				}
			}
		}
	}
}
