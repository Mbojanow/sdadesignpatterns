package pl.sdacademy.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {

  private List<Observer> observers;

  // stan tematu
  private int value;

  public Subject() {
    observers = new ArrayList<>();
  }

  //zasubrykowanie nowej osoby
  public void subscribe(final Observer observer) {
    observers.add(observer);
  }

  public void changeValue(final int newValue) {
    value = newValue;
    notifyAllObservers();
  }

  public int getValue() {
    return value;
  }

  //poinformowaniu wszystkich obserwujacych o zmiane stanu - czyli pola value
  public void notifyAllObservers() {
    observers.forEach(observer -> observer.update());
  }
}
