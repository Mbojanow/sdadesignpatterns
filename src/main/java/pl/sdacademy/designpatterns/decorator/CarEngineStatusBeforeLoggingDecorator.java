package pl.sdacademy.designpatterns.decorator;

public class CarEngineStatusBeforeLoggingDecorator implements EngineStarter {

  private EngineStarter engineStarter;

  // na wejscie dekorowany obiekt
  public CarEngineStatusBeforeLoggingDecorator(final EngineStarter engineStarter) {
    this.engineStarter = engineStarter;
  }

  @Override
  public void startEngine() {
    // dekorowanie
    System.out.println("Engine starting");
    //dekorator -> zawsze zachowuje bazowa funkcjonalnosc
    engineStarter.startEngine();
  }

  @Override
  public void stopEngine() {
    System.out.println("Engine stopping");
    engineStarter.stopEngine();
  }
}
