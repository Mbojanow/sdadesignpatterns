package pl.sdacademy.designpatterns.observer;

public class ByTenChangedObserver extends Observer {

  private int previousValue;

  public ByTenChangedObserver(final Subject subject) {
    super(subject);
    previousValue = subject.getValue();
  }

  @Override
  public void update() {
    if (Math.abs(subject.getValue() - previousValue) >= 10) {
      System.out.println("BTO: value changed at least by 10 and is now " + subject.getValue());
    }
    previousValue = subject.getValue();
  }
}
