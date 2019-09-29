package pl.sdacademy.designpatterns.memento;

public class MementoDemo {

  public static void main(String[] args) {

    final EditorText editorText = new EditorText();
    final EditorMementoManager editorMementoManager = new EditorMementoManager();

    editorText.addText("This is first line\n");
    editorMementoManager.save(new EditorTextMemento(editorText));

    editorText.addText("This is second line\n");
    editorMementoManager.save(new EditorTextMemento(editorText));

    editorText.addText("This is third line\n");
    editorMementoManager.save(new EditorTextMemento(editorText));

    editorText.addText("This is fourth line\n");
    editorMementoManager.save(new EditorTextMemento(editorText));
    System.out.println(editorText.getValue());
    System.out.println();

    editorMementoManager.restore();
    editorMementoManager.restore();
    editorMementoManager.restore();
    final EditorTextMemento memento = editorMementoManager.restore();

    editorText.restoreFromMemento(memento);
    System.out.println(editorText.getValue());
  }
}
