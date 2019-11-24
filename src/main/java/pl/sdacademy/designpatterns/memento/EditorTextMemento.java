package pl.sdacademy.designpatterns.memento;

import pl.sdacademy.designpatterns.memento.EditorText;

public class EditorTextMemento {

  private String value;

  public EditorTextMemento(final EditorText editorText) {
    this.value = editorText.getValue();
  }

  public String getValue() {
    return value;
  }
}

