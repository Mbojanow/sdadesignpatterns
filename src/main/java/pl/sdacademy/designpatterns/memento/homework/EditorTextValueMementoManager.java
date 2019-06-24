package pl.sdacademy.designpatterns.memento.homework;

import java.util.ArrayDeque;
import java.util.Deque;

public class EditorTextValueMementoManager {

    private final Deque<EditorTextValueMemento> mementos = new ArrayDeque<>();

    public void save(final EditorTextValueMemento editorTextValueMemento) {
        mementos.push(editorTextValueMemento);
    }

    public EditorTextValueMemento restore() {
        return mementos.pop();
    }
}
