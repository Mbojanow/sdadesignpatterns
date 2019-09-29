package pl.sdacademy.designpatterns.observer;

public class ObserverDemo {

  public static void main(String[] args) {
    final Subject subject = new Subject();

    //kazdy objserver subskrybuje subject automatycznie
    final Observer observerA = new ConcreteValueObserver(subject);
    final Observer observerB = new ValueLoweredObserver(subject);
    final Observer observerC = new ByTenChangedObserver(subject);

    subject.changeValue(5);
    subject.changeValue(7);
    subject.changeValue(-3);
    subject.changeValue(-5);
  }
}
