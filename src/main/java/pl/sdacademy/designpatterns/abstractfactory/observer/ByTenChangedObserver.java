package pl.sdacademy.designpatterns.abstractfactory.observer;

public class ByTenChangedObserver extends Observer {

  int observedValue = 0;

  public ByTenChangedObserver(final Subject subject) {
    super(subject);
  }

  @Override
  void update() {
    if (Math.abs(subject.getValue() - observedValue) >= 10) {
      System.out.println("BTC new value: " + subject.getValue());
    }
    observedValue = subject.getValue();
  }
}
