package pl.sdacademy.designpatterns.strategy;

public class StrategyDemo {
    public static void main(String[] args) {
        String toModify = "i wannA MoDify This kind  of teXt";
        TextModificationType type = TextModificationType.CAMEL_CASE;

        TextModificationService selectedStrategy = new TextModificationServiceProvider().provide(type);
        System.out.println(selectedStrategy.modify(toModify));
    }
}
