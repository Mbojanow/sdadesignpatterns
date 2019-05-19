package pl.sdacademy.designpatterns.observer;

public class ByTenChangedObserver extends Observer {

    private int previousValue;

    public ByTenChangedObserver(Subject subject) {
        super(subject);
        previousValue = subject.getValue();
    }

    @Override
    public void update() {
        if (Math.abs(previousValue - subject.getValue()) >= 10) {
            System.out.println("Value changed by at least ten and now is " + subject.getValue());
        }
        previousValue = subject.getValue();
    }
}
