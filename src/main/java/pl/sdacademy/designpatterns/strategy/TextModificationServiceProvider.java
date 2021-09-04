package pl.sdacademy.designpatterns.strategy;

public class TextModificationServiceProvider {

    public TextModificationService provide(TextModificationType type) {
        switch (type) {
            case CAMEL_CASE:
                return new CamelCaseTextModificationStrategy();
            case KEBAB_CASE:
                return new KebabCaseTextModificationStrategy();
            case COMPRESSION:
                return new CompressionTextModificationService();
        }
        // lepiej wyjatek własnego typu
        throw new RuntimeException("Unsupported text modification type");
    }
}
