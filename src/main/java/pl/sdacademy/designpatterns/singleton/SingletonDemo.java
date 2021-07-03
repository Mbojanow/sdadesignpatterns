package pl.sdacademy.designpatterns.singleton;

public class SingletonDemo {
    public static void main(String[] args) {
        Counter counterA = Counter.getInstance();
        Counter counterB = Counter.getInstance();
        counterA.addOne();
        counterB.addTwo();
        counterA.addThree();
        counterB.addTwo();
    }
}
