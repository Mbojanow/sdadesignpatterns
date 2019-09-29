package pl.sdacademy.designpatterns.observer;

public class ByTenChangedObserver extends Observer {

  private int previousValue;

  public ByTenChangedObserver(final Subject subject) {
    super(subject);
    subject.subscribe(this);
    previousValue = subject.getValue();
  }

  @Override
  public void update() {
    if (Math.abs(subject.getValue() - previousValue) >= 10) {
      System.out.println("By ten changed observer: " + subject.getValue());
    }
    previousValue = subject.getValue();
  }
}
