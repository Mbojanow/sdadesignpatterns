package pl.sdacademy.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private final List<Observer> observers = new ArrayList<>();

    private int value;

    public void register(Observer observer) {
        if (!observers.contains(observer)) {
            observers.add(observer);
        }
    }

    public void changeState(int change) {
        value += change; // += -> x = x + y
        // poinformowanie observerow o zmianie stanu
        observers.forEach(observer -> observer.update());
    }

    public int getValue() {
        return value;
    }
}
