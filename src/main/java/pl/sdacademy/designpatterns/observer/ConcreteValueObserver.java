package pl.sdacademy.designpatterns.observer;

public class ConcreteValueObserver extends Observer {

  public ConcreteValueObserver(final Subject subject) {
    super(subject);
    subject.subscribe(this);
  }

  @Override
  public void update() {
    System.out.println("Conrete value observer: new value is: " + subject.getValue());
  }
}
