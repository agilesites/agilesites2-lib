package wcs.java.model.editors;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jelerak on 3/11/2015.
 */
public class PullDownEditor extends AbstractAttributeEditor {

    private static final String PULLDOWN_START = "<PULLDOWN>";
    private static final String PULLDOWN_END = "</PULLDOWN>";
    private static final String PULLDOWN_ITEM_START = "<ITEM>";
    private static final String PULLDOWN_ITEM_END = "</ITEM>";
    private static final String QUERYASSET_START = "<QUERYASSETNAME>";
    private static final String QUERYASSET_END = "</QUERYASSETNAME>";

    protected List<String> itemList = new ArrayList<String>();

    protected String queryAssetName;

    public PullDownEditor(String name) {
        super(name) ;
    }

    public String toXml() {
        StringBuilder builder = new StringBuilder();
        builder.append(PULLDOWN_START);
        if (queryAssetName != null && queryAssetName.length() > 0){
            builder.append(QUERYASSET_START).append(queryAssetName).append(QUERYASSET_END);
        } else {
            for (String item: itemList){
                builder.append(PULLDOWN_ITEM_START).append(item).append(PULLDOWN_ITEM_END);
            }
        }
        builder.append(PULLDOWN_END);
        return builder.toString();
    }

    public static PullDownEditorBuilder getBuilder(String name) {
        return new PullDownEditorBuilder(name);
    }

    public static class PullDownEditorBuilder {

        PullDownEditor pullDownEditor;

        private PullDownEditorBuilder(String name) {
            pullDownEditor = new PullDownEditor(name);
        }

        public PullDownEditorBuilder addItem(String item) {
            pullDownEditor.itemList.add(item);
            return this;
        }

        public PullDownEditorBuilder setQueryAssetName(String queryAssetName) {
            pullDownEditor.queryAssetName = queryAssetName;
            return this;
        }

        public PullDownEditor build() {
            return pullDownEditor;
        }
    }
}
