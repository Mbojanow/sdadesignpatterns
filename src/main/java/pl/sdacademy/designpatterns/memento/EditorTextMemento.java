package pl.sdacademy.designpatterns.memento;

public class EditorTextMemento {

  // te same pola co klasa, które zapis reprezentujemy
  private String value;

  public EditorTextMemento(final EditorText editorText) {
    // deep copy!!!!!! nie shallow copy, tzn nie '=' dla obiektów!!!!
    value = editorText.getValue();
  }

  public String getValue() {
    return value;
  }
}
