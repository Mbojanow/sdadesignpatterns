package pl.sdacademy.designpatterns.abstractfactory.proxy.security;

public class ThreeDotsDemo {

  public static void main(final String args[]) {

    print("jeden");
    print("jeden", "dwa");
    print("wqe", "qwee", "asddssa", "dsads", "dadsad", "dsaasd");

    print(4);
  }

  static void print(final String... arguments) {
    // final String[] arguments = new String[];
    String output = "";
    for (int index = 0; index < arguments.length; index++) {
      output += arguments[index] + " ";
    }
    System.out.println(output);
  }

  static void print(int index, String... argument) {

  }

}
