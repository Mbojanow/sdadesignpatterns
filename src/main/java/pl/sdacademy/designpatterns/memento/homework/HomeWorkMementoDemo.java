package pl.sdacademy.designpatterns.memento.homework;

public class HomeWorkMementoDemo {
    public static void main(String[] args) {
        final EditorTextValue editorTextValue = new EditorTextValue();
        final EditorTextValueMementoManager mementoManager = new EditorTextValueMementoManager();

        editorTextValue.addText(1, "hello", EditType.ADD);
        mementoManager.save(new EditorTextValueMemento(editorTextValue));
        editorTextValue.addText(3, "3rd line", EditType.ADD);
        mementoManager.save(new EditorTextValueMemento(editorTextValue));
        editorTextValue.addText(5, "5th line", EditType.REPLACE);
        mementoManager.save(new EditorTextValueMemento(editorTextValue));
        editorTextValue.addText(5, "added value", EditType.ADD);
        mementoManager.save(new EditorTextValueMemento(editorTextValue));
        editorTextValue.addText(12, "12th line", EditType.ADD);
        mementoManager.save(new EditorTextValueMemento(editorTextValue));

        mementoManager.restore();
        mementoManager.restore();
        final EditorTextValueMemento memento = mementoManager.restore();
        editorTextValue.restoreFromMemento(memento);
        System.out.println(editorTextValue);
    }
}
