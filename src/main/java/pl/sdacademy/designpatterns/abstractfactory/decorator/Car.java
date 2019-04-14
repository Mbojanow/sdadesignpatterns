package pl.sdacademy.designpatterns.abstractfactory.decorator;

public class Car implements EngineStarter {

  private boolean engineStarted;

  @Override
  public void startEngine() {
    engineStarted = true;
  }

  @Override
  public void stopEngine() {
    engineStarted = false;
  }
}
