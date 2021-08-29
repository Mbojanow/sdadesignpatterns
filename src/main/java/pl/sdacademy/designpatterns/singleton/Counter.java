package pl.sdacademy.designpatterns.singleton;

// EAGER
public class Counter {
    private static final Counter COUNTER = new Counter();

    public static Counter getInstance() {
        return COUNTER;
    }

    private int value = 0;

    private Counter() {
    }

    public void addOne() {
        value++;
        System.out.println("Value is " + value);
    }

    public void addTwo() {
        value += 2;
        System.out.println("Value is " + value);
    }

    public void addThree() {
        value += 3;
        System.out.println("Value is " + value);
    }
}
