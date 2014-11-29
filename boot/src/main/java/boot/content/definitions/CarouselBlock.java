package boot.content.definitions;

import boot.content.Block;
import boot.content.Blocks;
import boot.content.Image;
import agilesites.AssetContentDefinition;

@AssetContentDefinition(name = "BtCarouselBlock", attributeType = "BtAttribute", parents = { Blocks.class })
public class CarouselBlock extends Block {

	private String title;

	private String subtitle;

	private String author;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSubtitle() {
		return subtitle;
	}

	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Image[] getImages() {
		return images;
	}

	public void setImages(Image[] images) {
		this.images = images;
	}

	private Image[] images;

}
