package pl.sdacademy.designpatterns.abstractfactory.singleton;

public enum EnumSingleton {
  INSTANCE;

  private int value = 0;

  public void add() {
    value += 1;
    System.out.println(value);
  }
}
