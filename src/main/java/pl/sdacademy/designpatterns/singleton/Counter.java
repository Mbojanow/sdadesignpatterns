package pl.sdacademy.designpatterns.singleton;

// SINGLETON
public class Counter {

  private static Counter INSTANCE = new Counter(); // EAGER
  private int value = 0;

  public static Counter getInstance() {
    return INSTANCE;
  }

  private Counter() {
  }

  public void addOne() {
    value++;
    System.out.println("Value incremented and is now " + value);
  }

  public void addTwo() {
    value += 2;
    System.out.println("Added two and value = " + value);
  }

  public void addThree() {
    value += 3;
    System.out.println("Added 3 and value = " + value);
  }
}
