package wcs.java.model.editors;

/**
 * Created by jelerak on 3/11/2015.
 */
public class UploaderEditor extends AbstractAttributeEditor {

    protected int maxValues;
    protected String maxFileSize;
    protected String fileTypes;
    protected int minWidth;
    protected int maxWidth;
    protected int minHeight;
    protected int maxHeight;

    public UploaderEditor(String name) {
        super(name) ;
    }

    public String toXml() {
        StringBuilder builder = new StringBuilder();
        builder.append("<UPLOADER " + getConfigElements() + "/>");
        return builder.toString();
    }

    public String getConfigElements() {
        StringBuilder stringBuilder =  new StringBuilder();
        stringBuilder.append(" MAXVALUES=\"").append(maxValues)
                .append("\" MAXFILESIZE=\"").append(maxFileSize)
                .append("\" FILETYPES=\"").append(fileTypes)
                .append("\" MINWIDTH=\"").append(minWidth)
                .append("\" MAXWIDTH=\"").append(maxWidth)
                .append("\" MINHEIGHT=\"").append(minHeight)
                .append("\" MAXHEIGHT=\"").append(maxHeight).append("\"");

        return stringBuilder.toString();
    }

    public static UploaderEditorBuilder getBuilder(String name) {
        return new UploaderEditorBuilder(name);
    }

    public static class UploaderEditorBuilder {

        UploaderEditor uploaderEditor;

        private UploaderEditorBuilder(String name) {
            uploaderEditor = new UploaderEditor(name);
        }

        public UploaderEditor build() {
            return uploaderEditor;
        }

        public UploaderEditorBuilder maxValues(int maxValues) {
            uploaderEditor.maxValues = maxValues;
            return this;
        }

        public UploaderEditorBuilder maxFileSize(String maxFileSize) {
            uploaderEditor.maxFileSize = maxFileSize;
            return this;
        }

        public UploaderEditorBuilder minWidth(int minWidth) {
            uploaderEditor.minWidth = minWidth;
            return this;
        }

        public UploaderEditorBuilder maxWidth(int maxWidth) {
            uploaderEditor.maxWidth = maxWidth;
            return this;
        }

        public UploaderEditorBuilder minHeight(int minHeight) {
            uploaderEditor.minHeight = minHeight;
            return this;
        }

        public UploaderEditorBuilder maxHeight(int maxHeight) {
            uploaderEditor.maxHeight = maxHeight;
            return this;
        }

        public UploaderEditorBuilder fileTypes(String... fileTypes) {
            StringBuilder sb = new StringBuilder();
            for (String fileType : fileTypes) {
                sb.append(fileType).append(",");
            }
            sb.deleteCharAt(sb.length() -1);
            uploaderEditor.fileTypes = sb.toString();
            return this;
        }

    }

}
