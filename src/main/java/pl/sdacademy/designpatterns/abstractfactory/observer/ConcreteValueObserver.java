package pl.sdacademy.designpatterns.abstractfactory.observer;

public class ConcreteValueObserver extends Observer {

  public ConcreteValueObserver(final Subject subject) {
    super(subject);
  }

  @Override
  void update() {
    System.out.println("CVO: new value is " + subject.getValue());
  }
}
