package pl.sdacademy.designpatterns.memento;

public class EditorText {

  private String value = "";
  //private int index

  public void addText(final String toAdd) {
    value += toAdd;
  }

  public String getValue() {
    return value;
  }

  public void restoreFromMemento(final EditorTextMemento editorTextMemento) {
    // kopiujemy z memento -> oryginalny obiekt
    this.value = editorTextMemento.getValue();
  }
}
