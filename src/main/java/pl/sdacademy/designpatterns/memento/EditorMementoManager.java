package pl.sdacademy.designpatterns.memento;

import java.util.ArrayDeque;
import java.util.Deque;

public class EditorMementoManager {

  // double eneded queue uzywamy jako stos
  private Deque<EditorTextMemento> mementos;

  public EditorMementoManager() {
    mementos = new ArrayDeque<>();
  }

  public void save(final EditorTextMemento memento) {
    mementos.push(memento);
  }

  public EditorTextMemento restore() {
    return mementos.pop();
  }
}
