package boot.content;

import agilesites.AssetType;
import agilesites.Blob;

/**
 * Basic asset type for images in the boot demo site
 * 
 * @author msciab
 *
 */
@AssetType(name="BtBlocks", flex=false, parent=false)
public class Image {

	public Blob image;

	public Blob getImage() {
		return image;
	}

	public void setImage(Blob image) {
		this.image = image;
	}
	
	private String altText;

	public String getAltText() {
		return altText;
	}

	public void setAltText(String altText) {
		this.altText = altText;
	}
	
	
}
