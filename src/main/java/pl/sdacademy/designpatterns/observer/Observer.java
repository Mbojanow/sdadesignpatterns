package pl.sdacademy.designpatterns.observer;

public abstract class Observer {

  protected final Subject subject;

  protected Observer(final Subject subject) {
    this.subject = subject;
    subject.subscribe(this);
  }

  // reakcja na zmianę stanu
  public abstract void update();
}
