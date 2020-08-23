package pl.sdacademy.designpatterns.memento;

//reprezentuje zapis dla klasy EditorText
public class EditorTextMemento {

  private String value;

  // na wejscie - obiekt z ktorego stan pobieramy
  public EditorTextMemento(EditorText editorText) {
    // deep copy - łatwe w tym przypadku, String - immutable
    value = editorText.getValue();
  }

  public String getValue() {
    return value;
  }
}
