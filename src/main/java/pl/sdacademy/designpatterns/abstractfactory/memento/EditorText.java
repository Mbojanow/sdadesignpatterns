package pl.sdacademy.designpatterns.abstractfactory.memento;

public class EditorText {

  private String text = "";

  public String getText() {
    return text;
  }

  public void setText(final String text) {
    this.text = text;
  }

  public void addText(final String text) {
    this.text += text;
  }

  public void restoreFromMemento(final EditorTextMemento memento) {
    this.text = memento.getText();
  }
}
