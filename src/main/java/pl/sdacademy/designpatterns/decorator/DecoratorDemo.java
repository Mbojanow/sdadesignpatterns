package pl.sdacademy.designpatterns.decorator;

public class DecoratorDemo {
  public static void main(String[] args) {
    final EngineStarter engineStarter = new CarEngineStatusAfterLoggingDecorator(new CarEngineStatusBeforeLoggingDecorator(new Car()));

    engineStarter.startEngine();
    engineStarter.stopEngine();



  }
}
