package pl.sdacademy.designpatterns.singleton;

//eager singleton

public class Counter {

  // singleton typu eager - tworzenie na starcie
  private static Counter instance = new Counter();

  private int value = 0;

  public static Counter getInstance() {
    return instance;
  }

  // chowamy mozliwosc stworzenia intancje za pomoca new
  private Counter() {
  }

  public void addOne() {
    value++;
    System.out.println("Value is now: " + value);
  }

  public void addTwo() {
    value += 2;
    System.out.println("Two added and value is now " + value);
  }

  public void addThree() {
    value += 3;
    System.out.println("Three added and value is equal to " + value);
  }

}
