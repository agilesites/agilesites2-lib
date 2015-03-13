package wcs.java.model.editors;

public abstract class AbstractAttributeEditor  {

    //protected EditorTypeNames editorType;
    protected String name;

    public AbstractAttributeEditor(String name) { //, EditorTypeNames editorType) {
        this.name = name;
        //this.editorType = editorType;
    }

/*
    public EditorTypeNames getEditorType() {
        return editorType;
    }
*/

    public String getName() {
        return name;
    }

    public abstract String toXml();
}
