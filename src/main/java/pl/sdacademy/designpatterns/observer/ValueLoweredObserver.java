package pl.sdacademy.designpatterns.observer;

public class ValueLoweredObserver extends Observer {

  private int previousValue;

  public ValueLoweredObserver(final Subject subject) {
    super(subject);
    previousValue = subject.getValue();
  }

  @Override
  public void update() {
    if (subject.getValue() < previousValue) {
      System.out.println("VLO: value has lowered and is now " + subject.getValue());
    }
    previousValue = subject.getValue();
  }
}
