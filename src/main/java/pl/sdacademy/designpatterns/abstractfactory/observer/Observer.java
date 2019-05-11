package pl.sdacademy.designpatterns.abstractfactory.observer;

public abstract class Observer {

  protected Subject subject;

  public Observer(final Subject subject) {
    this.subject = subject;
  }

  abstract void update();
}
