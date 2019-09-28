package pl.sdacademy.designpatterns.decorator;

public class Car implements EngineStarter {

  private boolean isEngineStarted;

  @Override
  public void startEngine() {
    isEngineStarted = true;
  }

  @Override
  public void stopEngine() {
    isEngineStarted = false;
  }
}
