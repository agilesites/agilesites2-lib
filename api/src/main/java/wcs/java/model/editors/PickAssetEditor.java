package wcs.java.model.editors;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jelerak on 3/11/2015.
 */
public class PickAssetEditor extends AbstractAttributeEditor {

    private static final String PICKASSET_START = "<PICKASSET>";
    private static final String PICKASSET_END = "</PICKASSET>";

    protected int maxValues;

    public PickAssetEditor(String name) {
        super(name) ;
    }

    public String toXml() {
        StringBuilder builder = new StringBuilder();
        builder.append(PICKASSET_START);
        builder.append(PICKASSET_END);
        return builder.toString();
    }

    public static PickAssetEditorBuilder getBuilder(String name) {
        return new PickAssetEditorBuilder(name);
    }

    public static class PickAssetEditorBuilder {

        PickAssetEditor pickAssetEditor;

        private PickAssetEditorBuilder(String name) {
            pickAssetEditor = new PickAssetEditor(name);
        }

        public PickAssetEditor build() {
            return pickAssetEditor;
        }

        public PickAssetEditorBuilder maxValues(int maxValues) {
            pickAssetEditor.maxValues = maxValues;
            return this;
        }
    }
}
