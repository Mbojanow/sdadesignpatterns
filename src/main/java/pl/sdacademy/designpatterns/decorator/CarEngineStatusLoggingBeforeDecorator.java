package pl.sdacademy.designpatterns.decorator;

public class CarEngineStatusLoggingBeforeDecorator implements EngineStarter {

  private final EngineStarter engineStarter;

  public CarEngineStatusLoggingBeforeDecorator(final EngineStarter engineStarter) {
    this.engineStarter = engineStarter;
  }

  @Override
  public void startEngine() {
    System.out.println("Starting engine...");
    engineStarter.startEngine();
  }

  @Override
  public void stopEngine() {
    System.out.println("Stopping engine...");
    engineStarter.stopEngine();
  }
}
