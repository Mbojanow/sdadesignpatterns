package pl.sdacademy.designpatterns.observer;

public abstract class Observer {
    protected final Subject subject;

    protected Observer(Subject subject) {
        this.subject = subject;
        subject.register(this);
    }

    public abstract void onStateChange();
}
