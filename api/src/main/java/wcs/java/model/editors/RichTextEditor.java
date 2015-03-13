package wcs.java.model.editors;

/**
 * Created by jelerak on 3/11/2015.
 */
public class RichTextEditor extends AbstractAttributeEditor  {

    //Default Values
    private String widthValue = "400";
    private String heightValue = "600";
    private String allowedAssetTypesValue;

    private RichTextEditor(RichTextEditorBuilder builder) {
        super(builder.name);
        if(null != builder.heightValue){
            this.heightValue = builder.heightValue;
        }
        if(null != builder.widthValue){
            this.widthValue = builder.widthValue;
        }
        if(null != builder.allowedAssetTypesValue){
            this.allowedAssetTypesValue= builder.allowedAssetTypesValue;
        }


    }

    public String toXml() {
        return "<CKEDITOR"+ getConfigElements()+ "/>";
    }

    public String getConfigElements() {
        StringBuilder stringBuilder =  new StringBuilder();
        stringBuilder.append(" WIDTH=\"").append(widthValue)
                .append("\" HEIGHT=\"").append(heightValue);

        if (allowedAssetTypesValue != null) {
            stringBuilder.append("\" ALLOWEDASSETTYPES=\"").append(allowedAssetTypesValue).append("\" ");
        }

        return stringBuilder.toString();
    }

    public static RichTextEditorBuilder getBuilder(String name) {

        return new RichTextEditorBuilder(name);
    }

    public static class RichTextEditorBuilder {

        private String name;
        private String widthValue;
        private String heightValue;
        private String allowedAssetTypesValue;

        private RichTextEditorBuilder(String name) {
            this.name = name;
        }

        public RichTextEditorBuilder widthValue(String widthValue) {
            this.widthValue = widthValue;
            return this;
        }

        public RichTextEditorBuilder heightValue(String heightValue) {
            this.heightValue = heightValue;
            return this;
        }
        public RichTextEditorBuilder allowedAssetTypesValue(String allowedAssetTypesValue) {
            this.allowedAssetTypesValue= allowedAssetTypesValue;
            return this;
        }

        public RichTextEditor build() {
            return new RichTextEditor(this);
        }

    }
}
