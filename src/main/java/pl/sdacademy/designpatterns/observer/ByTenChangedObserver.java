package pl.sdacademy.designpatterns.observer;

public class ByTenChangedObserver extends Observer {

    private int previousValue;

    public ByTenChangedObserver(Subject subject) {
        super(subject);
        previousValue = subject.getValue();
    }

    @Override
    void update() {
        if (Math.abs(subject.getValue() - previousValue) >= 10) {
            System.out.println("Value changed by at least 10 and is now " + subject.getValue());
        }
        previousValue = subject.getValue();
    }
}
