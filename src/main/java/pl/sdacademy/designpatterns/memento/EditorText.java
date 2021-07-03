package pl.sdacademy.designpatterns.memento;

public class EditorText {

    private String text = "";

    public void addText(String textToAdd) {
        text += textToAdd;
    }

    public String getText() {
        return text;
    }

    public void restoreFromMemento(EditorTextMemento memento) {
        // kopiujemy wszystkie pola (pole po polu)
        // wykonujemy DEEP copy, a nie shallow copy
        text = memento.getText();
    }
}
