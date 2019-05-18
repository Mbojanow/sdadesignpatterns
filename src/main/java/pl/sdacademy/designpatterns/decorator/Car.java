package pl.sdacademy.designpatterns.decorator;


public class Car implements EngineStarter {
  private boolean engineStarted = false;

  @Override
  public void startEngine() {
    engineStarted = true;
  }

  @Override
  public void stopEngine() {
    engineStarted = false;
  }
}
