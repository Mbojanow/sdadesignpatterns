package pl.sdacademy.designpatterns.memento;

public class EditorTextMemento {

    private final String text;

    public EditorTextMemento(EditorText editorText) {
        // kopiujemy wszystkie pola (pole po polu)
        // wykonujemy DEEP copy, a nie shallow copy
        text = editorText.getText();
    }

    public String getText() {
        return text;
    }
}
