package pl.sdacademy.designpatterns.abstractfactory.memento;

public class EditorTextMemento {

  private String value;

  public EditorTextMemento(final EditorText editorText) {
    this.value = editorText.getValue();
  }

  public String getValue() {
    return value;
  }

  public void setValue(final String value) {
    this.value = value;
  }
}
