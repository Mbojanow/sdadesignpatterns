package pl.sdacademy.designpatterns.abstractfactory.observer;

public class ValueLoweredObserver extends Observer {

  private int lastValue;

  public ValueLoweredObserver(final Subject subject) {
    this.subject = subject;
    subject.register(this);
    lastValue = subject.getValue();
  }

  @Override
  public void update() {
    if (subject.getValue() < lastValue) {
      System.out.println("VALUE LOWERED: " + subject.getValue());
    }
    lastValue = subject.getValue();
  }
}
