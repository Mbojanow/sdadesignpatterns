package pl.sdacademy.designpatterns.decorator;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class CarEngineStatusBeforeLoggingDecorator implements EngineStarter {

  private EngineStarter engineStarter;

  // kontstruktor z bazowym interfejsem jako parametr
  // umożliwia używanie ciągu 'new' dla wielu dekoratorów
  public CarEngineStatusBeforeLoggingDecorator(final EngineStarter engineStarter) {
    this.engineStarter = engineStarter;
  }

  @Override
  public void startEngine() {
    System.out.println("Engine will start in a second");
    engineStarter.startEngine();
  }

  @Override
  public void stopEngine() {
    System.out.println("Engine will stop in a second");
    engineStarter.stopEngine();
  }
}
