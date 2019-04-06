package pl.sdacademy.designpatterns.abstractfactory.singleton;

public class Counter {

  private int counter = 0;
  private static Counter counterInstance = new Counter();

  public static Counter getInstance() {
    return counterInstance;
  }

  private Counter () {

  }

  public void addOne() {
    counter += 1;
    System.out.println("Counter is " + counter);
  }

  public void addTwo() {
    counter += 2;
    System.out.println("Counter is " + counter);
  }

  public void addThree() {
    counter += 3;
    System.out.println("Counter is " + counter);
  }
}
