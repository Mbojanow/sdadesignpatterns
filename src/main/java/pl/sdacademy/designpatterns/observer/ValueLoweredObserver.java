package pl.sdacademy.designpatterns.observer;

public class ValueLoweredObserver extends Observer {

    private int previousState;

    public ValueLoweredObserver(Subject subject) {
        super(subject);
        previousState = subject.getValue();
    }

    @Override
    public void onStateChange() {
        if (subject.getValue() < previousState) {
            System.out.println("Value lowered and is now " + subject.getValue());
        }
        previousState = subject.getValue();
    }
}
