package pl.sdacademy.designpatterns.memento;

import java.util.ArrayDeque;
import java.util.Deque;

public class EditorTextMementoManager {

    // stos
    private final Deque<EditorTextMemento> mementos = new ArrayDeque<>();

    public void save(EditorText editorText) {
        mementos.push(new EditorTextMemento(editorText));
    }

    public EditorTextMemento restore() {
        return mementos.pop();
    }
}
