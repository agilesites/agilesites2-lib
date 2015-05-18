package wcs.java.model;

/**
 * Created by alemonge1 on 11/05/2015.
 */
public class BasicAsset {

    String name;
    String descriptorFileName;

    public BasicAsset(String name, String descriptorFileName) {
        this.name = name;
        this.descriptorFileName = descriptorFileName;
    }

    public String getName() {
        return name;
    }

    public String getDescriptorFileName() {
        return descriptorFileName;
    }

}
