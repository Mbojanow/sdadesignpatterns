package pl.sdacademy.designpatterns.observer;

public class ObserverDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();
        Observer observer = new AllValueObserver(subject);
        Observer observer2 = new ValueLoweredObserver(subject);
        Observer observer3 = new ByTenChangedObserver(subject);

        subject.update(3);
        subject.update(-2);
        subject.update(12);
        subject.update(-10);
    }
}
