package pl.sdacademy.designpatterns.decorator;

public class DecoratorDemo {
  public static void main(String[] args) {
    //EngineStarter engineStarter = new CarEngineStatusLoggingBeforeDecorator(new CarEngineStatusLoggingAfterDecorator(new Car()));
    EngineStarter engineStarter = new CarEngineStatusLoggingAfterDecorator(new CarEngineStatusLoggingBeforeDecorator(new Car()));

    engineStarter.startEngine();
    engineStarter.stopEngine();
  }
}
