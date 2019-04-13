package pl.sdacademy.designpatterns.decorator.logging;

public class DecoratorDemo {

    public static void main(final String[] args) {
        final EngineStarter engineStarter = new CarEngineStatusAfterLoggingDecorator(new CarEngineStatusBeforeLoggingDecorator(new Car()));

        engineStarter.startEngine();
    }
}
