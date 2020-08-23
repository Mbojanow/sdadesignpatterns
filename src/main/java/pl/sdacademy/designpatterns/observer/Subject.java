package pl.sdacademy.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

// Subject // Observable // dowolną inną nazwe
public class Subject {

  private int value = 0; // nasz stan

  private List<Observer> observers = new ArrayList<>();

  // możliwość zarejestrowania obserwujace
  public void subscribe(final Observer observer) {
    observers.add(observer);
  }

  // poinformowania wszystkich obserwujących o zmianie stanu
  public void notifyStateChanged() {
    observers.forEach(Observer::update);
  }

  // zmiana stanu
  public void changeState(final int different) {
    value += different;
    notifyStateChanged();
  }

  public int getValue() {
    return value;
  }
}
