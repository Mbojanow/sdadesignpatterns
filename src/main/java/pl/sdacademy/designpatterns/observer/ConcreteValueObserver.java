package pl.sdacademy.designpatterns.observer;

public class ConcreteValueObserver extends Observer {

  public ConcreteValueObserver(final Subject subject) {
    super(subject);
  }

  @Override
  public void update() {
    System.out.println("CVO: value has changed and is now " + subject.getValue());
  }
}
