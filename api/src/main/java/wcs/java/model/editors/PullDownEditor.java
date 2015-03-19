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

    protected List<String> itemList = new ArrayList<String>();

    public PullDownEditor(String name) {
        super(name) ;
    }

    public String toXml() {
        StringBuilder builder = new StringBuilder();
        builder.append(PULLDOWN_START);
        for (String item: itemList){
            builder.append(PULLDOWN_ITEM_START).append(item).append(PULLDOWN_ITEM_END);
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

        public PullDownEditor build() {
            return pullDownEditor;
        }
    }
}
