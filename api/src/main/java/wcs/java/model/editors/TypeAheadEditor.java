package wcs.java.model.editors;

/**
 * Created by jelerak on 3/11/2015.
 */
public class TypeAheadEditor extends AbstractAttributeEditor {

    protected int maxValues;
    protected int pagesize;

    public TypeAheadEditor(String name) {
        super(name) ;
    }

    public String toXml() {
        StringBuilder builder = new StringBuilder();
        builder.append("<TYPEAHEAD " + getConfigElements() + "/>");
        return builder.toString();
    }

    public String getConfigElements() {
        StringBuilder stringBuilder =  new StringBuilder();
        if (pagesize > 0) {
            stringBuilder.append(" PAGESIZE=\"").append(pagesize).append("\"");
        }

        if (maxValues > 0) {
            stringBuilder.append(" MAXVALUES=\"").append(maxValues).append("\"");
        }
        return stringBuilder.toString();
    }

    public static PickAssetEditorBuilder getBuilder(String name) {
        return new PickAssetEditorBuilder(name);
    }

    public static class PickAssetEditorBuilder {

        TypeAheadEditor pickAssetEditor;

        private PickAssetEditorBuilder(String name) {
            pickAssetEditor = new TypeAheadEditor(name);
        }

        public TypeAheadEditor build() {
            return pickAssetEditor;
        }

        public PickAssetEditorBuilder maxValues(int maxValues) {
            pickAssetEditor.maxValues = maxValues;
            return this;
        }
        public PickAssetEditorBuilder pageSize(int pageSize) {
            pickAssetEditor.pagesize = pageSize;
            return this;
        }
    }
}
