package pl.sdacademy.designpatterns.observer;

public class ByTenChangedObserver extends Observer {

  private static final int REACTION_BOUND_VALUE = 10;

  private int previousValue;

  public ByTenChangedObserver(final Subject subject) {
    super(subject);
    previousValue = subject.getValue();
  }

  @Override
  public void update() {
    if (Math.abs(previousValue - subject.getValue()) >= REACTION_BOUND_VALUE) {
      System.out.println("BTCO: value is now " + subject.getValue());
    }
    previousValue = subject.getValue();
  }
}
