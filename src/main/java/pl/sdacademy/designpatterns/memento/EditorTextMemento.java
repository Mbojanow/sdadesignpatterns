package pl.sdacademy.designpatterns.memento;

public class EditorTextMemento {

    private String value;

    public EditorTextMemento(final EditorText editorText) {
        this.value = editorText.getValue();
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
