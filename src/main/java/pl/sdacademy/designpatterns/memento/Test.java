package pl.sdacademy.designpatterns.memento;

public class Test {
  public static void main(String[] args) {
    String a = "a";
    String b = a;
    a += "qwe";
    System.out.println(b); // a - String jest immutable
  }
}
