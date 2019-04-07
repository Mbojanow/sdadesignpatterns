package pl.sdacademy.designpatterns.abstractfactory.observer;

import java.util.Observable;

public class ObserverDemo {

  public static void main(final String[] args) {

    final Subject subject = new Subject();

    final Observer observerA = new ConcreteValueObserver(subject);
    final Observer observerB = new ValueLoweredObserver(subject);
    final Observer observerC = new ByTenChangedObserver(subject);

    subject.valueChanged(3);
    subject.valueChanged(5);
    subject.valueChanged(4);
    subject.valueChanged(-15);
    Observable
  }
}
