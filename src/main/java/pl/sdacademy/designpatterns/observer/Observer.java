package pl.sdacademy.designpatterns.observer;

public abstract class Observer {

  protected Subject subject;

  public Observer(final Subject subject) {
    this.subject = subject;
    subject.subscribe(this);
  }

  // reakcja na zmiane stanu
  public abstract void update();
}
