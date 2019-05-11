package pl.sdacademy.designpatterns.abstractfactory.observer;

public class ObserverDemo {

  public static void main(final String[] args) {

    final Subject subject = new Subject();

    final Observer obs = new ConcreteValueObserver(subject);
    final Observer obs2 = new ByTenChangedObserver(subject);
    final Observer obs3 = new ValueLoweredObserver(subject);

    subject.addObserver(obs);
    subject.addObserver(obs2);
    subject.addObserver(obs3);

    subject.valueChanged(5);
    subject.valueChanged(7);
    subject.valueChanged(6);
    subject.valueChanged(20);
  }
}
