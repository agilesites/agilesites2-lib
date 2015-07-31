package wcs.java.model.editors;

/**
 * Created by jelerak on 3/11/2015.
 */
public class TextareaEditor extends AbstractAttributeEditor {

    protected int width;
    protected int height;
    protected boolean resize;
    protected String wrapStyle;


    public TextareaEditor(String name) {
        super(name) ;
    }

    public String toXml() {
        StringBuilder builder = new StringBuilder();
        builder.append("<TEXTAREA " + getConfigElements() + "/>");
        return builder.toString();
    }

    public String getConfigElements() {
        StringBuilder stringBuilder =  new StringBuilder();
        stringBuilder.append(" WRAPSTYLE=\"").append(wrapStyle).append("\"")
                .append(" WIDTH=\"").append(width).append("\"")
                .append(" HEIGHT=\"").append(height).append("\"")
                .append(" RESIZE=\"").append(resize).append("\"");

        return stringBuilder.toString();
    }

    public static TextareaEditorBuilder getBuilder(String name) {
        return new TextareaEditorBuilder(name);
    }

    public static class TextareaEditorBuilder {

        TextareaEditor uploaderEditor;

        private TextareaEditorBuilder(String name) {
            uploaderEditor = new TextareaEditor(name);
        }

        public TextareaEditor build() {
            return uploaderEditor;
        }

        public TextareaEditorBuilder resize(boolean resize) {
            uploaderEditor.resize = resize;
            return this;
        }

        public TextareaEditorBuilder wrapStyle(String wrapStyle) {
            uploaderEditor.wrapStyle = wrapStyle;
            return this;
        }

        public TextareaEditorBuilder width(int width) {
            uploaderEditor.width = width;
            return this;
        }

        public TextareaEditorBuilder height(int height) {
            uploaderEditor.height = height;
            return this;
        }

    }

}
