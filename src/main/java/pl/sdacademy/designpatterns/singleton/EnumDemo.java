package pl.sdacademy.designpatterns.singleton;

public class EnumDemo {
  public static void main(String[] args) {
    final EnumSingleton enumA = EnumSingleton.INSTANCE;
    final EnumSingleton enumB = EnumSingleton.INSTANCE;

    enumA.increment();
    enumB.increment();
  }
}
