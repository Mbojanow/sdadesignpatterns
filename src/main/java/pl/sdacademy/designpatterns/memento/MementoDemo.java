package pl.sdacademy.designpatterns.memento;

public class MementoDemo {

    public static void main(String[] args) {

        final EditorTextMementoManager manager = new EditorTextMementoManager();
        final EditorText editorText = new EditorText();
        manager.save(new EditorTextMemento(editorText));

        editorText.addText("This is the first line ");
        manager.save(new EditorTextMemento(editorText));

        editorText.addText("This is line 1 continuation");
        manager.save(new EditorTextMemento(editorText));

        editorText.addText("\nThis is line 2");
        manager.save(new EditorTextMemento(editorText));

        editorText.addText("\nThis is line 3");
        manager.save(new EditorTextMemento(editorText));

        manager.restore();
        manager.restore();
        final EditorTextMemento memento = manager.restore();

        editorText.restoreFromMemento(memento);

        System.out.println(editorText.getValue());
    }
}
