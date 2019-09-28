package pl.sdacademy.designpatterns.builder;

public class LombokDemo {
  public static void main(String[] args) {
    final SomeClass someClassInstance = SomeClass.builder().age(15)
        .fieldA("asdads")
        .name("Andrzej")
        .build();
  }
}
