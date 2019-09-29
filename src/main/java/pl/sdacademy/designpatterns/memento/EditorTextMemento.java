package pl.sdacademy.designpatterns.memento;

import java.util.ArrayList;
import java.util.List;

//reprezentuje zapis obiektu EditorText
public class EditorTextMemento {

  private String value;
  //private List<String> x;

  public EditorTextMemento(final EditorText editorText) {
    value = editorText.getValue();

    // deep copy
    //x = new ArrayList<>(editorText.getX());
  }

  public String getValue() {
    return value;
  }
}
