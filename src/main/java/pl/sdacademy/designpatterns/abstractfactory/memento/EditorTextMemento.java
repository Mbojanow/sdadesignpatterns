package pl.sdacademy.designpatterns.abstractfactory.memento;

public class EditorTextMemento {

  private String text;

  public EditorTextMemento(final EditorText editorText) {
    this.text = editorText.getText();
  }

  public String getText() {
    return text;
  }

  public void setText(final String text) {
    this.text = text;
  }
}
