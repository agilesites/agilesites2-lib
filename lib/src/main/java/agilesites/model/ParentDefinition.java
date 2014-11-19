package agilesites.model;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.fatwire.assetapi.common.AssetAccessException;
import com.fatwire.assetapi.data.AssetData;
import com.fatwire.assetapi.data.AssetDataManager;
import com.fatwire.assetapi.data.AssetId;
import com.fatwire.assetapi.data.AttributeData;
import com.fatwire.assetapi.data.AttributeDataImpl;
import com.fatwire.assetapi.def.AttributeTypeEnum;
import com.fatwire.assetapi.query.SimpleQuery;
import com.openmarket.xcelerate.asset.AssetIdImpl;
import com.openmarket.xcelerate.asset.AttributeDefImpl;

public class ParentDefinition implements HasSetData {

	String parentTable;
	String attributeTable;
	long id;
	String name;
	String sitename;
	String description;
	AssetDataManager adm;

	public ParentDefinition(String parentTable, String attributeTable, long id,
			String name, String description) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.parentTable = parentTable;
		this.attributeTable = attributeTable;
	}

	@Override
	public long getId() {
		return id;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public String getType() {
		return parentTable;
	}

	protected AttributeDataImpl attrData(String name, AttributeTypeEnum type,
			Object value) {
		return new AttributeDataImpl(new AttributeDefImpl(name, type), name,
				type, value);
	}

	protected AttributeDataImpl attrData(String name, boolean isRequired) {
		return attrData(name, AttributeTypeEnum.STRING, isRequired ? "true"
				: "false");
	}

	protected AttributeDataImpl attrData(String name, String value) {
		return attrData(name, AttributeTypeEnum.STRING, value);
	}

	private Map<String, AttributeData> attributeMap(long id,
			boolean isRequired, int order) {

		AssetId aid = new AssetIdImpl(attributeTable, id);
		Map<String, AttributeData> map = new HashMap<String, AttributeData>();
		AttributeDataImpl ordinal = new AttributeDataImpl(new AttributeDefImpl(
				"ordinal", AttributeTypeEnum.INT), "ordinal",
				AttributeTypeEnum.INT, Integer.valueOf(order));
		map.put("ordinal", ordinal);
		AttributeDataImpl required = new AttributeDataImpl(
				new AttributeDefImpl("required", AttributeTypeEnum.STRING),
				"required", AttributeTypeEnum.STRING, isRequired ? "true"
						: "false");
		map.put("required", required);
		AttributeDataImpl asset = new AttributeDataImpl(new AttributeDefImpl(
				"assetid", AttributeTypeEnum.ASSET), "assetid",
				AttributeTypeEnum.ASSET, aid);
		map.put("assetid", asset);
		return map;
	}

	private Map<String, AttributeData> groupMap(long id, boolean isRequired,
			boolean isMultiple) {

		AssetId aid = new AssetIdImpl(parentTable, id);

		Map<String, AttributeData> map = new HashMap<String, AttributeData>();

		map.put("required", attrData("required", isRequired));
		map.put("multiple", attrData("multiple", isMultiple));

		map.put("assetid", attrData("assetid", AttributeTypeEnum.ASSET, aid));

		return map;
	}

	List<Object> attributeIds = new LinkedList<Object>();
	List<Boolean> isRequireds = new LinkedList<Boolean>();

	/**
	 * add an attribute by AttibuteEnun
	 * 
	 * @param id
	 * @param isRequired
	 * @return
	 */
	public ParentDefinition addAttribute(AttributeEnum ae, boolean isRequired) {
		attributeIds.add(ae.getId());
		isRequireds.add(isRequired);
		return this;
	}

	/**
	 * add an attribute by name
	 * 
	 * @param name
	 * @param isRequired
	 * @return
	public ParentDefinition addAttribute(String name, boolean isRequired) {
		attributeIds.add(name);
		isRequireds.add(isRequired);
		return this;
	}	 */


	List<Long> parentIds = new LinkedList<Long>();
	List<Boolean> isMultipleParents = new LinkedList<Boolean>();
	List<Boolean> isRequiredParents = new LinkedList<Boolean>();

	public ParentDefinition addParent(AttributeEnum ae, boolean isMultiple,
			boolean isRequired) {
		isMultipleParents.add(isMultiple);
		isRequiredParents.add(isRequired);
		parentIds.add(ae.getId());
		return this;
	}

	@Override
	public void setData(AssetData ad) {
		int i = 0;
		for (Object obj : attributeIds) {
			long id = -1;
			if (obj instanceof String) {
				id = findAttributeByName(obj.toString());
			}
			if (obj instanceof Long) {
				id = ((Long) obj).longValue();
			}
			if (id > 0) {
				boolean req = isRequireds.get(i);
				Map<?, ?> map = attributeMap(id, req, i + 1);
				ad.getAttributeData("Attributes").addData(map);
			} else {
				System.out.println("skipping attribute " + obj);
			}
			i++;
		}

		i = 0;
		for (Long id : parentIds) {
			boolean mul = isMultipleParents.get(i);
			boolean req = isRequiredParents.get(i);
			Map<?, ?> map = groupMap(id.longValue(), mul, req);
			ad.getAttributeData("Groups").addData(map);
			i++;
		}

	}

	@Override
	public void setAdm(String sitename, AssetDataManager adm) {
		this.adm = adm;
		this.sitename = sitename;
	}

	private long findAttributeByName(String attributename) {
		if (!attributename.startsWith(sitename + "_"))
			attributename = sitename + "_" + attributename;
		SimpleQuery sq = new SimpleQuery(attributeTable, "", null,
				Arrays.asList("name"));
		try {
			for (AssetData curr : adm.read(sq)) {
				String name = curr.getAttributeData("name").getData()
						.toString();
				if (name.equals(attributename))
					return curr.getAssetId().getId();
			}
		} catch (AssetAccessException e) {
			e.printStackTrace();
		}
		return -1;
	}
}
