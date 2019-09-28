package pl.sdacademy.designpatterns.decorator;

public class DecoratorDemo {
  public static void main(String[] args) {
    final EngineStarter decoratedCar =
        new CarEngineStatusBeforeLoggingDecorator(new CarEngineStatusAfterLoggingDecorator(new Car()));

    decoratedCar.startEngine();
    decoratedCar.stopEngine();
  }
}
