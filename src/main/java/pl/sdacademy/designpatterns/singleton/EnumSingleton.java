package pl.sdacademy.designpatterns.singleton;

// singleton typu eager enum
// bezpieczny do uzywania w aplikacji wielowatkowej
public enum EnumSingleton {
  INSTANCE;

  private int value = 0;

  public void increment() {
    value++;
    System.out.println(value);
  }
}
