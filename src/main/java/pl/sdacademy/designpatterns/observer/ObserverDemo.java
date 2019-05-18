package pl.sdacademy.designpatterns.observer;

public class ObserverDemo {
  public static void main(String[] args) {
    final Subject subject = new Subject();
    final Observer o1 = new ConcreteValueObserver(subject);
    final Observer o2 = new ValueLoweredObserver(subject);

    subject.addObserver(o1);
    subject.addObserver(o2);

    subject.modifyValue(1);
    subject.modifyValue(4);
    subject.modifyValue(-5);
    subject.modifyValue(10);
  }
}
