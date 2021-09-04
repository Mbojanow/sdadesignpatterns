package pl.sdacademy.designpatterns.strategy;

import java.util.Arrays;
import java.util.stream.Collectors;

public class KebabCaseTextModificationStrategy implements TextModificationService {
    // This is some StrinG -> this-is-some-string
    @Override
    public String modify(String toModify) {
        return Arrays.stream(toModify.split(" "))
                .map(word -> word.trim().toLowerCase())
                .collect(Collectors.joining("-"));
    }
}
