package pl.sdacademy.designpatterns.memento;

public class EditorText {
  private String value = "";

  public void addText(final String textToAdd) {
    value += textToAdd;
  }

  public String getValue() {
    return value;
  }

  public void restoreFromMemento(final EditorTextMemento memento) {
    //deep copy!
    value = memento.getValue();
  }
}
