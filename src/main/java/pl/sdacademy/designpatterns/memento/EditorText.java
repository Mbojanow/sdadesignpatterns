package pl.sdacademy.designpatterns.memento;

import java.util.ArrayList;
import java.util.List;

public class EditorText {

  private String value = "";
  //private List<String> x = new ArrayList<>();

  public void addText(final String textToAdd) {
    value += textToAdd;
  }

  public String getValue() {
    return value;
  }

  public void restoreFromMemento(final EditorTextMemento memento) {
    value = memento.getValue();
  }

//  public List<String> getX() {
//    return x;
//  }
}
