package pl.sdacademy.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {

  private int value = 0;
  private List<Observer> observers;

  public Subject() {
    observers = new ArrayList<>();
  }

  public void modifyValue(final int change) {
    value += change;
    notifyAllObservers();
  }

  public void subscribe(final Observer observer) {
    if (!observers.contains(observer)) {
      observers.add(observer);
    }
  }

  public int getValue() {
    return value;
  }

  // poinformowanie obserwujących o zmianie stanu
  private void notifyAllObservers() {
    observers.forEach(observer -> observer.update());
  }
}
