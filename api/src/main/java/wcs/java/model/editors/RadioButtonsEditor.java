package wcs.java.model.editors;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jelerak on 3/11/2015.
 */
public class RadioButtonsEditor extends AbstractAttributeEditor {

    private static final String RADIOBUTTON_END = "</RADIOBUTTONS>";
    private static final String RADIOBUTTON_ITEM_START = "<ITEM>";
    private static final String RADIOBUTTON_ITEM_END = "</ITEM>";
    private static final String QUERYASSET_START = "<QUERYASSETNAME>";
    private static final String QUERYASSET_END = "</QUERYASSETNAME>";

    protected List<String> itemList = new ArrayList<String>();
    protected String layout = LayoutEnum.VERTICAL.toString();

    public RadioButtonsEditor(String name) {
        super(name) ;
    }

    protected String queryAssetName;

    public String toXml() {
        StringBuilder builder = new StringBuilder();
        builder.append("<RADIOBUTTONS LAYOUT= '").append(layout).append("'>");
        if (queryAssetName != null && queryAssetName.length() > 0){
            builder.append(QUERYASSET_START).append(queryAssetName).append(QUERYASSET_END);
        } else {
            for (String item: itemList){
                builder.append(RADIOBUTTON_ITEM_START).append(item).append(RADIOBUTTON_ITEM_END);
            }
        }
        builder.append(RADIOBUTTON_END);
        return builder.toString();
    }

    public static RadioButtonsEditorBuilder getBuilder(String name) {
        return new RadioButtonsEditorBuilder(name);
    }

    public static class RadioButtonsEditorBuilder {

        RadioButtonsEditor radioButtonsEditor;

        private RadioButtonsEditorBuilder(String name) {
            radioButtonsEditor = new RadioButtonsEditor(name);
        }

        public RadioButtonsEditorBuilder addItem(String item) {
            radioButtonsEditor.itemList.add(item);
            return this;
        }

        public RadioButtonsEditorBuilder setLayout(LayoutEnum layout) {
            radioButtonsEditor.layout = layout.toString();
            return this;
        }

        public RadioButtonsEditorBuilder setQueryAssetName(String queryAssetName) {
            radioButtonsEditor.queryAssetName = queryAssetName;
            return this;
        }

        public RadioButtonsEditor build() {
            return radioButtonsEditor;
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
