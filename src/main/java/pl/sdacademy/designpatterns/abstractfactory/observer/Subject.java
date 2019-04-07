package pl.sdacademy.designpatterns.abstractfactory.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {

  private List<Observer> observers;
  private int value;

  public Subject() {
    this.observers = new ArrayList<>();
  }

  public void register(final Observer observer) {
    if (!observers.contains(observer)) {
      observers.add(observer);
    }
  }

  public void unregister(final Observer observer) {
    observers.remove(observer);
  }

  public void valueChanged(final int newValue) {
    value = newValue;
    notifyAllObservers();
  }

  private void notifyAllObservers() {
    observers.forEach(Observer::update);
  }

  public int getValue() {
    return value;
  }
}
