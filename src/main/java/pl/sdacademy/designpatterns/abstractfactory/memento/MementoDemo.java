package pl.sdacademy.designpatterns.abstractfactory.memento;

public class MementoDemo {

  public static void main(final String[] args) {

    EditorTextMementoManager manager = new EditorTextMementoManager();

    EditorText editorText = new EditorText();

    editorText.addText("SDA IS AWESOME\n");
    manager.save(new EditorTextMemento(editorText));
    editorText.addText("DESIGN PATTERNS ARE COOL\n");
    manager.save(new EditorTextMemento(editorText));
    editorText.addText("I was just joking, they can be boring\n");
    manager.save(new EditorTextMemento(editorText));
    editorText.addText("This should not be displayed later on\n");
    System.out.println(editorText.getText());
    manager.restore();
    editorText.restoreFromMemento(manager.restore());
    System.out.println(editorText.getText());

  }
}
