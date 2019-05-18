package pl.sdacademy.designpatterns.singleton;

public class Counter {

  private static Counter counter = new Counter();

  public static Counter getInstance() {
    return counter;
  }

  private Counter() {}

  private int count = 0;

  public void addOne() {
    count += 1;
    System.out.println(count);
  }

  public void addTwo() {
    count += 2;
    System.out.println(count);
  }

  public void addThree() {
    count += 3;
    System.out.println(count);
  }
}
