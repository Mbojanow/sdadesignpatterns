package pl.sdacademy.designpatterns.memento.homework;

import java.util.Map;

public class EditorTextValueMemento {

    private Map<Integer, String> lineNumbersToTextValue;

    public EditorTextValueMemento(final EditorTextValue editorTextValue) {
        this.lineNumbersToTextValue = editorTextValue.getCopyOfLineNumbersToTextValue();
    }

    public Map<Integer, String> getLineNumbersToTextValue() {
        return lineNumbersToTextValue;
    }
}
