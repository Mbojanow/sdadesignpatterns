package pl.sdacademy.designpatterns.memento;

import java.util.ArrayDeque;
import java.util.Deque;

public class EditorTextMementoManager {

  // chcemy uzywac jako stos
  private Deque<EditorTextMemento> mementos = new ArrayDeque<>();

  public void save(final EditorText editorText) {
    mementos.push(new EditorTextMemento(editorText));
  }

  public EditorTextMemento restore() {
    return mementos.pop();
  }
}
