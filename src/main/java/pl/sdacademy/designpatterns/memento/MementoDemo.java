package pl.sdacademy.designpatterns.memento;

public class MementoDemo {
  public static void main(String[] args) {
    final EditorText editorText = new EditorText();
    final EditorTextMementoManager mementoManager = new EditorTextMementoManager();

    editorText.addText("This is the first line");
    mementoManager.save(new EditorTextMemento(editorText));
    editorText.addText("\nThis is second line. ");
    mementoManager.save(new EditorTextMemento(editorText));
    editorText.addText("This is second line continuation");
    mementoManager.save(new EditorTextMemento(editorText));
    editorText.addText("\nThis is third line stuff");
    mementoManager.save(new EditorTextMemento(editorText));

    mementoManager.restore();
    mementoManager.restore();
    final EditorTextMemento restoredState = mementoManager.restore();

    editorText.restoreFromMemento(restoredState);
    System.out.println(editorText.getValue());
  }
}
