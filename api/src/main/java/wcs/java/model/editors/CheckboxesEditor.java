package wcs.java.model.editors;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jelerak on 3/11/2015.
 */
public class CheckboxesEditor extends AbstractAttributeEditor {

    private static final String CHECKBOXES_END = "</CHECKBOXES>";
    private static final String CHECKBOXES_ITEM_START = "<ITEM>";
    private static final String CHECKBOXES_ITEM_END = "</ITEM>";

    protected List<String> itemList = new ArrayList<String>();
    protected String layout = LayoutEnum.VERTICAL.toString();

    public CheckboxesEditor(String name) {
        super(name) ;
    }

    public String toXml() {
        StringBuilder builder = new StringBuilder();
        builder.append("<CHECKBOXES LAYOUT= '").append(layout).append("'>");
        for (String item: itemList){
            builder.append(CHECKBOXES_ITEM_START).append(item).append(CHECKBOXES_ITEM_END);
        }
        builder.append(CHECKBOXES_END);
        return builder.toString();
    }

    public static CheckboxesEditorBuilder getBuilder(String name) {
        return new CheckboxesEditorBuilder(name);
    }

    public static class CheckboxesEditorBuilder {

        CheckboxesEditor checkboxesEditor;

        private CheckboxesEditorBuilder(String name) {
            checkboxesEditor = new CheckboxesEditor(name);
        }

        public CheckboxesEditorBuilder addItem(String item) {
            checkboxesEditor.itemList.add(item);
            return this;
        }

        public CheckboxesEditorBuilder setLayout(LayoutEnum layout) {
            checkboxesEditor.layout = layout.toString();
            return this;
        }

        public CheckboxesEditor build() {
            return checkboxesEditor;
        }
    }

    public enum LayoutEnum {
        HORIZONTAL("HORIZONTAL"),
        VERTICAL("VERTICAL");

        private String layout;

        private LayoutEnum(String layout) {
            this.layout = layout;
        }

        public String toString() {
            return layout;
        }
    }

}
