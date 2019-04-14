package pl.sdacademy.designpatterns.abstractfactory.singleton;

public class Counter {

  private static Counter instance = new Counter();

  public static Counter getInstance() {
    return instance;
  }

  private int counter = 0;

  private Counter() {
  }

  public void addOne() {
    counter += 1;
    System.out.println(counter);
  }

  public void addTwo() {
    counter += 2;
    System.out.println(counter);
  }

  public void addThree() {
    counter += 3;
    System.out.println(counter);
  }
}
