package pl.sdacademy.designpatterns.singleton;

public class A {

  private Counter counterY = Counter.getInstance();

  public void hello() {
    counterY.addOne();
    System.out.println("");
  }

}
