package pl.sdacademy.designpatterns.singleton;

public class Counter {

  private static final Counter INSTANCE = new Counter();

  private int value = 0;

  public static Counter getInstance() {
    return INSTANCE;
  }

  private Counter() {
  }

  public void addOne() {
    value++;
    System.out.println(value);
  }

  public void addTwo() {
    value += 2;
    System.out.println(value);
  }

  public void addThree(){
    value += 3;
    System.out.println(value);
  }
}
