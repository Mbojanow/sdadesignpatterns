package pl.sdacademy.designpatterns.observer;

public class ObserverDemo {
  public static void main(String[] args) {
    final Subject subject = new Subject();
    final Observer observerA = new ConcreteValueObserver(subject);
    final Observer observerB = new ValueLoweredObserver(subject);
    final Observer observerC = new ByTenChangedObserver(subject);

    subject.changeValueBy(2);
    subject.changeValueBy(-1);
    subject.changeValueBy(5);
    subject.changeValueBy(-15);
  }
}
