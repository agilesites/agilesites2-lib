package wcs.java.model;

import COM.FutureTense.Interfaces.ICS;
import com.fatwire.assetapi.def.AssetTypeDefManager;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class BasicAssetModelBase {

    private List<BasicAsset> basicAssets = new LinkedList<BasicAsset>();


    public BasicAssetModelBase() {
    }

    public void addBasicAsset(BasicAsset data) {
        basicAssets.add(data);
    }


    public void basicAsset(String name, String descriptorFile) {
        BasicAsset ba = new BasicAsset(name, descriptorFile);
        addBasicAsset(ba);
    }

    public String build(ICS ics, AssetTypeDefManager atdm, String siteName) {

        File base = new File(ics.GetProperty("xcelerate.defaultbase",
                "futuretense_xcel.ini", true));

        StringBuffer msg = new StringBuffer();
        for (BasicAsset basicAsset : basicAssets) {
            try {
                StringBuilder sb = new StringBuilder();
                String filename = siteName + "/basicassets/" + basicAsset.getDescriptorFileName();
                InputStream is = this.getClass().getClassLoader().getResourceAsStream(filename);
                BufferedReader br = new BufferedReader(new InputStreamReader(is));
                String line;
                while ((line = br.readLine()) != null) {
                    sb.append(line.trim());
                }
                File basicFile = new File(base, basicAsset.getName());
                String descriptor = sb.toString().replace("%defdir%", basicFile.getAbsolutePath());
                atdm.createAssetMakerAssetType(basicAsset.getName(), basicAsset.getDescriptorFileName(),
                        descriptor, false, false);
                msg.append(String.format("Basic asset %s CREATED\n", basicAsset.getName()));
            } catch (Exception e) {
                msg.append(String.format("Basic asset %s creation FAILED\n", basicAsset.getName()));
            }
        }
        return msg.toString();

    }

}
