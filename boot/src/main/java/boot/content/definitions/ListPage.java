package boot.content.definitions;

import boot.content.Block;
import agilesites.AssetContentDefinition;
import agilesites.Page;

/**
 * Vertical List content definition for Pages.
 * 
 * It defines a page as a vertical list of blocks.
 */
@AssetContentDefinition(name = "BtListPage", attributeType="PageAttribute", parents = { })
public class ListPage extends Page {
	private Block[] blocks;

	public Block[] getBlocks() {
		return blocks;
	}

	public void setBlocks(Block[] blocks) {
		this.blocks = blocks;
	}
}
