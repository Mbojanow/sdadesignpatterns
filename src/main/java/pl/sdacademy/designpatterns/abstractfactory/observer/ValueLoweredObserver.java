package pl.sdacademy.designpatterns.abstractfactory.observer;

public class ValueLoweredObserver extends Observer {

  int observedValue = 0;

  public ValueLoweredObserver(final Subject subject) {
    super(subject);
  }

  @Override
  void update() {
    if (subject.getValue() < observedValue){
      System.out.println("VLO new value is: " + subject.getValue());
    }
    observedValue = subject.getValue();
  }
}
