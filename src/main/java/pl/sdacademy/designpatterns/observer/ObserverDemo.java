package pl.sdacademy.designpatterns.observer;

public class ObserverDemo {
  public static void main(String[] args) {
    final Subject subject = new Subject();

    final Observer observerA = new ConcreteValueObserver(subject);
    final Observer observerB = new ValueLoweredObserver(subject);
    final Observer observerC = new ByTenChangedObserver(subject);

    subject.modifyValue(3);
    subject.modifyValue(-5);
    subject.modifyValue(-1);
    subject.modifyValue(11);
  }
}
