package pl.sdacademy.designpatterns.abstractfactory.decorator;

public class DecoratorDemo {

  public static void main(final String[] args) {

    final EngineStarter decoratedCar = new CarEngineStatusBeforeLoggingDecorator(
        new CarEngineStatusAfterLoggingDecorator(
            new Car()));

    decoratedCar.startEngine();
  }
}
