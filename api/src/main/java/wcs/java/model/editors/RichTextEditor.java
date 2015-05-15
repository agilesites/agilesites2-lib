package wcs.java.model.editors;

/**
 * Created by jelerak on 3/11/2015.
 */
public class RichTextEditor extends AbstractAttributeEditor  {

    //Default Values
    private String widthValue = "400";
    private String heightValue = "600";
    private String allowedAssetTypesValue;
    private String toolbarValue;
    private String configValue;
    private String configObjValue;

    private RichTextEditor(String name) {
        super(name);
    }

    public String toXml() {
        return "<CKEDITOR"+ getConfigElements()+ "/>";
    }

    public String getConfigElements() {
        StringBuilder stringBuilder =  new StringBuilder();
        stringBuilder.append(" WIDTH=\"").append(widthValue).append("\"")
                .append(" HEIGHT=\"").append(heightValue).append("\"");

        if (allowedAssetTypesValue != null) {
            stringBuilder.append(" ALLOWEDASSETTYPES=\"").append(allowedAssetTypesValue).append("\"");
        }
        if (toolbarValue != null) {
            stringBuilder.append(" TOOLBAR=\"").append(toolbarValue).append("\"");
        }
        if (configValue != null) {
            stringBuilder.append(" CONFIG=\"").append(configValue).append("\"");
        }
        if (configObjValue != null) {
            stringBuilder.append(" CONFIGOBJ=\"").append(configObjValue).append("\"");
        }

        return stringBuilder.toString();
    }

    public static RichTextEditorBuilder getBuilder(String name) {

        return new RichTextEditorBuilder(name);
    }

    public static class RichTextEditorBuilder {

        private RichTextEditor richTextEditor;

        private RichTextEditorBuilder(String name) {
            richTextEditor = new RichTextEditor(name);
        }

        public RichTextEditorBuilder widthValue(String widthValue) {
            richTextEditor.widthValue = widthValue;
            return this;
        }

        public RichTextEditorBuilder heightValue(String heightValue) {
            richTextEditor.heightValue = heightValue;
            return this;
        }
        public RichTextEditorBuilder allowedAssetTypesValue(String allowedAssetTypesValue) {
            richTextEditor.allowedAssetTypesValue= allowedAssetTypesValue;
            return this;
        }

        public RichTextEditorBuilder toolbarValue(String toolbarValue) {
            richTextEditor.toolbarValue = toolbarValue;
            return this;
        }

        public RichTextEditorBuilder configValue(String configValue) {
            richTextEditor.configValue = configValue;
            return this;
        }

        public RichTextEditorBuilder configObjValue(String configObjValue) {
            richTextEditor.configObjValue = configObjValue;
            return this;
        }

        public RichTextEditor build() {
            return richTextEditor;
        }

    }
    public enum YesNoEnum {
        YES("YES"),
        NO("NO");

        private String value;

        private YesNoEnum(String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }
    }

}
