package pl.sdacademy.designpatterns.singleton;

//singleton typu lazy
public class LazyCounter {

    private static LazyCounter instance;

    public static LazyCounter getInstance() {
        if (instance == null) { // A i B
            instance = new LazyCounter();
        }
        return instance;
    }

    private int value;

    private LazyCounter() {
    }

    public void increase(int value) {
        this.value += value;
    }
}
