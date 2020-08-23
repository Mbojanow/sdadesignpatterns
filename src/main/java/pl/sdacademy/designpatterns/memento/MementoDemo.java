package pl.sdacademy.designpatterns.memento;

public class MementoDemo {
  public static void main(String[] args) {
    final EditorText editorText = new EditorText();
    final EditorTextMementoManager mementoManager = new EditorTextMementoManager();

    mementoManager.save(editorText);

    editorText.addText("This is first line");
    mementoManager.save(editorText);

    editorText.addText("\nThis is second line");
    mementoManager.save(editorText);

    editorText.addText("Added text to second line");
    mementoManager.save(editorText);

    System.out.println(editorText.getValue());
    System.out.println("-----------------------");

    mementoManager.restore(); // CTRL + Z
    mementoManager.restore(); // CTRL + Z
    final EditorTextMemento memento = mementoManager.restore();// CTRL + Z
    editorText.restoreFromMemento(memento); // przywrocony stan

    System.out.println(editorText.getValue());
  }
}
