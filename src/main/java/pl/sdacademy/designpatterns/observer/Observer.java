package pl.sdacademy.designpatterns.observer;

public abstract class Observer {

  protected Subject subject;

  public Observer(final Subject subject) {
    this.subject = subject;
  }

  // metoda - reakcja na zmiane stanu
  // musze nadpisac -> abstract
  public abstract void update();

  // nie musze jej nadpisywac bo nie jst abstract!
//  public void asd() {
//
//  }
}
