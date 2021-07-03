package pl.sdacademy.designpatterns.observer;

public class ByTenChangedObserver extends Observer {

    private static final int BOUND = 10;

    private int previousValue;

    public ByTenChangedObserver(Subject subject) {
        super(subject);
        previousValue = subject.getValue();
    }

    @Override
    public void onStateChange() {
        if (Math.abs(subject.getValue() - previousValue) >= BOUND) {
            System.out.println("Value changed by at least 10 and is now " + subject.getValue());
        }
        previousValue = subject.getValue();
    }
}
