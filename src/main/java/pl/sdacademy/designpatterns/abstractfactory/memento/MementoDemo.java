package pl.sdacademy.designpatterns.abstractfactory.memento;

public class MementoDemo {

  public static void main(String[] args) {
    final EditorText editorText = new EditorText("");
    final EditorTextMementoManager mementoManager = new EditorTextMementoManager();
    mementoManager.save(new EditorTextMemento(editorText));

    editorText.addText("This is first line ");
    mementoManager.save(new EditorTextMemento(editorText));

    editorText.addText(" this is first line continuation");
    mementoManager.save(new EditorTextMemento(editorText));

    editorText.addText("\nThis is second Line");
    mementoManager.save(new EditorTextMemento(editorText));

    editorText.addText("\nThis is third line");
    mementoManager.save(new EditorTextMemento(editorText));

    System.out.println(editorText.getValue());
    mementoManager.restore();
    mementoManager.restore();
    final EditorTextMemento memento = mementoManager.restore();
    editorText.restoreFromMemento(memento);
    System.out.println("\n");
    System.out.println(editorText.getValue());
  }


}
