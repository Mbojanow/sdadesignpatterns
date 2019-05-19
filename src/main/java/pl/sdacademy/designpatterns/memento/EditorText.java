package pl.sdacademy.designpatterns.memento;

public class EditorText {

    private String value = "";

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void addText(final String textToAdd) {
        value += textToAdd;
    }

    public void restoreFromMemento(final EditorTextMemento editorTextMemento) {
        this.value = editorTextMemento.getValue();
    }
}
