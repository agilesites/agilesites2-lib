package wcs.java;

import java.util.List;

import wcs.java.util.Util;

import com.fatwire.assetapi.data.BlobObject;
import com.fatwire.assetapi.data.BlobObjectImpl;
import com.fatwire.assetapi.data.MutableAssetData;

/**
 * CSElement definition class
 * 
 * @author msciab
 * 
 */
public class CSElement extends AssetSetup {

	private Class<?> elementClass;
	private String elementName;

    // default poll interval for cselements is 0
    // assumed they are called by cached elements
    private int poll = 0;

	/**
	 * Create a CSElement invoking the given elementClass
	 * 
	 * @param name
	 * @param elementClass
	 */
	public CSElement(String name, Class<?> elementClass) {
		this(name, elementClass, (String) null);
	}

	/**
	 * Create invoking the given elementClass with a specifice elementName
	 * (useful for fixed elements like attribute editors)
	 */
	public CSElement(String name, Class<?> elementClass, String elementName) {
		super("CSElement", "", name);
		this.elementClass = elementClass;
		this.elementName = elementName;
	}

    /**
     * Set poll interval
     * @param poll
     * @return
     */
    public CSElement poll(int poll) {
        this.poll = poll;
        return this;
    }

	/**
	 * Create a cselement with a chained asset setup
	 * 
	 */
	public CSElement(String name, Class<?> elementClass, AssetSetup nextSetup) {
		this(name, elementClass);
		setNextSetup(nextSetup);
	}

	/**
	 * Return the name of cselement
	 */ 
	public String getElementName() {
		return elementName;
	}

	/**
	 * Return the list of attributes name
	 */ 
	public List<String> getAttributes() {
		return Util.listString("name", "description", "elementname",
				"rootelement", "url", "resdetails1", "resdetails2");
	}

	private String template(String clazz) {
		return Util.getResource("/Streamer.jsp").replaceAll("%CLASS%", clazz).replaceAll("%POLL%", ""+poll);
	}

	/**
	 * Set the cselement data from another data set
	 */ 
	void setData(MutableAssetData data) {
		String elementName = null;
		String elementJsp = null;
		String className = elementClass.getCanonicalName();
		if (this.elementName == null) {
			elementName = getSite() + "/" + getName();
			elementJsp = elementName + "_" + className + ".jsp";
		} else {
			elementName = this.elementName;
			elementJsp = getSite() + "/" + elementName + "_" + className
					+ ".jsp";
		}

		// root element
		data.getAttributeData("rootelement").setData(elementName);
		// addAttribute(data, "rootelement", element);

		// element name
		data.getAttributeData("elementname").setData(elementName);
		// addAttribute(data, "elementname", element);

		data.getAttributeData("resdetails1").setData(
				"eid=" + data.getAssetId().getId());
		data.getAttributeData("resdetails2").setData(
				"timestamp=" + System.currentTimeMillis());

		// blob
		byte[] bytes = template(elementClass.getCanonicalName()).getBytes();
		BlobObject blob = new BlobObjectImpl(elementJsp, "AgileSites", bytes);
		data.getAttributeData("url").setData(blob);
		
		// data.getAttributeData("createdby").setData("agilesites");
		// data.getAttributeData("createddate").setData(new Date());
		// data.getAttributeData("Mapping").setData(new ArrayList());
		// data.getAttributeData("Mapping").setData(new AttributeMan HashMap());
	}

	/**
	 * Set the description
	 * 
	 * @param description
	 * @return
	 */
	public AssetSetup description(String description) {
		setDescription(description);
		return this;
	}
}
