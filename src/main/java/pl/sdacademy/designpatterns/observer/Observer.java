package pl.sdacademy.designpatterns.observer;

public abstract class Observer {

    protected final Subject subject;

    protected Observer(Subject subject) {
        this.subject = subject;
        subject.register(this);
    }

    // reakcja na zmianę stanu
    abstract void update();
}
