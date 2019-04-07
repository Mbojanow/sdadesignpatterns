package pl.sdacademy.designpatterns.abstractfactory.observer;

public class ConcreteValueObserver extends Observer {

  public ConcreteValueObserver(final Subject subject) {
    this.subject = subject;
    this.subject.register(this);
  }

  @Override
  public void update() {
    System.out.println("CONCRETE VALUE OBSERVER, NEW VALUE: " + subject.getValue());
  }
}
