package pl.sdacademy.designpatterns.abstractfactory.memento;

import java.util.ArrayDeque;
import java.util.Deque;

public class EditorTextMementoManager {

  private Deque<EditorTextMemento> mementos = new ArrayDeque<>();
  // var list = new ArrayList<Integer>();
  // Map<String, Set<User>> = x.getMap();
  // var map = x.getMap();

  public void save(final EditorTextMemento editorTextMemento) {
    mementos.push(editorTextMemento);
  }

  public EditorTextMemento restore() {
    return mementos.pop();
  }

}
