package pl.sdacademy.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private int value; // stan
    private List<Observer> observers = new ArrayList<>();

    void register(Observer observer) {
        if (!observers.contains(observer)) {
            observers.add(observer);
        }
    }

    // zaktualizowanie stanu i poinformowaniu o tym observerów
    void update(int difference) {
        value += difference;
        observers.forEach(observer -> observer.onStateChange());
    }

    public int getValue() {
        return value;
    }
}
