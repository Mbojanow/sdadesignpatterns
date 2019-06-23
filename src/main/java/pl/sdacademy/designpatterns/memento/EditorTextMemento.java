package pl.sdacademy.designpatterns.memento;

public class EditorTextMemento {

  private String value;

  public EditorTextMemento(final EditorText editorText) {
    // tu kopiujemy wszystkie pola z oryginalnego obiektu do obiektu memento
    // originalny obiekt -> memento
    this.value = editorText.getValue();
    //this.index = editorText.getIndex();
  }

  public String getValue() {
    return value;
  }

  public void setValue(final String value) {
    this.value = value;
  }
}
