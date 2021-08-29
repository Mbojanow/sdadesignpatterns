package pl.sdacademy.designpatterns.observer;

public class SpecificValueObserver extends Observer {

    public SpecificValueObserver(Subject subject) {
        super(subject);
    }

    @Override
    void update() {
        System.out.println("Value changes and is now " + subject.getValue());
    }
}
