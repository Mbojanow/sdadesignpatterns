package pl.sdacademy.designpatterns.singleton;

public class CounterDemo {

  public static void main(String[] args) {
    final Counter counterA = Counter.getInstance(); // NIE DA SIE -> new Counter();
    final Counter counterB = Counter.getInstance();

    counterA.addOne();
    counterB.addTwo();
    counterA.addThree();
    counterB.addOne();
  }
}
