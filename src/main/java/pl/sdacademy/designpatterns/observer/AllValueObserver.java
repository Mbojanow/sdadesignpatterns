package pl.sdacademy.designpatterns.observer;

public class AllValueObserver extends Observer {

    public AllValueObserver(Subject subject) {
        super(subject);
    }

    @Override
    public void onStateChange() {
        System.out.println("Value changed and is now " + subject.getValue());
    }
}
