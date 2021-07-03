package pl.sdacademy.designpatterns.singleton;

// singleton typu EAGER
public class Counter {

    private static final Counter INSTANCE = new Counter();

    public static Counter getInstance() {
        return INSTANCE;
    }

    private int value;

    private Counter() {
    }

    public void addOne() {
        value++;
        System.out.println("Value is now " + value);
    }

    public void addTwo() {
        value += 2;
        System.out.println("Value increased by 2 and is now " + value);
    }

    public void addThree() {
        value += 3;
        System.out.println("Value = " + value);
    }
}
