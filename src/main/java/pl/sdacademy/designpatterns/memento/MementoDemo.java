package pl.sdacademy.designpatterns.memento;

public class MementoDemo {
    public static void main(String[] args) {
        EditorText editorText = new EditorText();
        EditorTextMementoManager mementoManager = new EditorTextMementoManager();
        mementoManager.save(editorText);
        editorText.addText("This is first line");
        mementoManager.save(editorText);
        editorText.addText("\nThis is second line");
        mementoManager.save(editorText);
        editorText.addText("\nThis is third line");
        mementoManager.save(editorText);
        editorText.addText("This is second part of third line");
        mementoManager.save(editorText);


        mementoManager.restore();
        // ctrl + z
        mementoManager.restore();
        EditorTextMemento restore = mementoManager.restore();
        editorText.restoreFromMemento(restore);
        System.out.println(editorText.getText());
    }
}
