package pl.sdacademy.designpatterns.strategy;

public class CompressionTextModificationService implements TextModificationService {
    @Override
    public String modify(String toModify) {
        //String.join("", toModify.split(" "));
        return toModify.replace(" ", "");
    }
}
