package pl.sdacademy.designpatterns.abstractfactory.memento;

public class EditorText {

  private String value;

  public EditorText(final String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public void setValue(final String value) {
    this.value = value;
  }

  public void addText(final String textToAdd) {
    value += textToAdd;
  }

  public void restoreFromMemento(final EditorTextMemento editorTextMemento) {
    value = editorTextMemento.getValue();
  }
}
