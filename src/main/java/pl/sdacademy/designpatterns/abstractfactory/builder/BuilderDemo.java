package pl.sdacademy.designpatterns.abstractfactory.builder;

import java.util.Collections;

public class BuilderDemo {

  public static void main() {
    final Player player = new Player.Builder()
        .withLevel(15L)
        .withHealth(50)
        .withMana(20)
        .withNick("THE KILLER")
        .withFriends(Collections.emptyList())
        .build();

    Person.builder().age(12).name("asd").build();
  }
}
