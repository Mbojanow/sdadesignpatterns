package pl.sdacademy.designpatterns.abstractfactory.singleton;

public enum EnumSingleton {
  INSTANCE;

  public void hello() {
    System.out.println("hello");
  }
}
