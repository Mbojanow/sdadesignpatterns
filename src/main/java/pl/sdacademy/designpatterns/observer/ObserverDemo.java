package pl.sdacademy.designpatterns.observer;

import java.util.List;

public class ObserverDemo {
  public static void main(String[] args) {
    final Subject subject = new Subject();
    List<Observer> observers = List.of(new SpecificValueObserver(subject),
        new ValueLoweredObserver(subject),
        new ByTenChangedObserver(subject));

    subject.changeState(5); // SVO
    subject.changeState(1); // SVO
    subject.changeState(-2); // SVO, VLO
    subject.changeState(-11); // SVO, VLO, BTO
  }
}
