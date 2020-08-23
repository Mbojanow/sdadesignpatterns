package pl.sdacademy.designpatterns.decorator;

public class CarEngineStatusLoggingAfterDecorator implements EngineStarter {

  private final EngineStarter engineStarter;

  public CarEngineStatusLoggingAfterDecorator(final EngineStarter engineStarter) {
    this.engineStarter = engineStarter;
  }

  @Override
  public void startEngine() {
    engineStarter.startEngine();
    System.out.println("Engine has started...");
  }

  @Override
  public void stopEngine() {
    engineStarter.stopEngine();
    System.out.println("Engine has stopped");
  }
}
