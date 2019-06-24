package pl.sdacademy.designpatterns.memento.homework;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class EditorTextValue {

    private static final String EMPTY_LINE = "";

    private Map<Integer, String> lineNumbersToTextValue = new HashMap<>();

    public void addText(final int lineNumber, final String lineText, final EditType editType) {
        switch (editType) {
            case ADD:
                addText(lineNumber, lineText);
                break;
            case REPLACE:
                replaceText(lineNumber, lineText);
                break;
            default:
                throw new RuntimeException("Unsupported edit type");
        }
    }

    private void addText(final int lineNumber, final String lineText) {
        if (lineNumberExists(lineNumber)) {
            lineNumbersToTextValue.put(lineNumber, lineNumbersToTextValue.get(lineNumber) + lineText);
        } else {
            createLineWithValue(lineNumber, lineText);
        }
    }

    private boolean lineNumberExists(final int lineNumber) {
        return lineNumbersToTextValue.size() >= lineNumber && lineNumbersToTextValue.containsKey(lineNumber);
    }

    private void createLineWithValue(final int lineNumber, final String lineText) {
        final int currentLinesNum = lineNumbersToTextValue.size();
        for (int lineIndex = currentLinesNum + 1; lineIndex < lineNumber; lineIndex++) {
            lineNumbersToTextValue.put(lineIndex, EMPTY_LINE);
        }
        lineNumbersToTextValue.put(lineNumber, lineText);
    }

    private void replaceText(final int lineNumber, final String lineText) {
        if (lineNumberExists(lineNumber)) {
            lineNumbersToTextValue.put(lineNumber, lineText);
        } else {
            createLineWithValue(lineNumber, lineText);
        }
    }

    public Map<Integer, String> getCopyOfLineNumbersToTextValue() {
        return new HashMap<>(lineNumbersToTextValue);
    }

    public void restoreFromMemento(final EditorTextValueMemento memento) {
        this.lineNumbersToTextValue = new HashMap<>(memento.getLineNumbersToTextValue());
    }

    @Override
    public String toString() {
        return lineNumbersToTextValue.entrySet().stream()
                .map(this::lineNumberWithTextToString)
                .collect(Collectors.joining("\n"));
    }

    private String lineNumberWithTextToString(final Map.Entry<Integer, String> indexToValue) {
        return indexToValue.getKey() + " " + indexToValue.getValue();
    }
}
