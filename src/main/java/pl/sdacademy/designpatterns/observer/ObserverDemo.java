package pl.sdacademy.designpatterns.observer;

public class ObserverDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();
        new SpecificValueObserver(subject); // SVO
        new ValueLoweredObserver(subject); // VLO
        new ByTenChangedObserver(subject); // BTO
        subject.changeState(2); // SVO
        subject.changeState(3); // SVO
        subject.changeState(-1); // SVO, VLO
        subject.changeState(12); // SVO, BTO
        subject.changeState(-10); // SVO, VLO, BTO
    }
}
