package pl.sdacademy.designpatterns.memento;

public class MementoDemo {

  public static void main(String[] args) {

    final EditorText editorText = new EditorText();
    final EditorTextMementoManager mementoManager = new EditorTextMementoManager();

    mementoManager.save(new EditorTextMemento(editorText));
    editorText.addText("This is my first line");
    mementoManager.save(new EditorTextMemento(editorText));
    editorText.addText(". This is first line continuation");
    mementoManager.save(new EditorTextMemento(editorText));
    editorText.addText("\nadd second line");
    mementoManager.save(new EditorTextMemento(editorText));
    editorText.addText("\nThis is third line");
    mementoManager.save(new EditorTextMemento(editorText));

    System.out.println(editorText.getValue() + "\n");

    mementoManager.restore();
    mementoManager.restore();
    editorText.restoreFromMemento(mementoManager.restore());

    System.out.println(editorText.getValue());
  }
}
