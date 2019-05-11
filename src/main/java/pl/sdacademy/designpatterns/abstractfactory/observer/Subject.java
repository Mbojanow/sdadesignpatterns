package pl.sdacademy.designpatterns.abstractfactory.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {

  private List<Observer> observers = new ArrayList<>();
  private int value;

  void addObserver(final Observer observer) {
    observers.add(observer);
  }

  void valueChanged(final int newValue) {
    value = newValue;
    // poinformowac observerow o zmianach stanu
    observers.forEach(Observer::update);
  }

  public int getValue() {
    return value;
  }
}
