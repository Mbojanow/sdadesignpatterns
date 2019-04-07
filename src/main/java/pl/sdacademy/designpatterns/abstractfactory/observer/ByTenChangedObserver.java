package pl.sdacademy.designpatterns.abstractfactory.observer;

import lombok.extern.slf4j.Slf4j;

public class ByTenChangedObserver extends Observer {

  private int lastValue;

  public ByTenChangedObserver(final Subject subject) {
    this.subject = subject;
    subject.register(this);
    lastValue = subject.getValue();
  }

  @Override
  public void update() {
    if (Math.abs(subject.getValue() - lastValue) >= 10) {
      System.out.println("VALUE CHANGED BY 10: " + subject.getValue());
    }
    lastValue = subject.getValue();
  }
}
