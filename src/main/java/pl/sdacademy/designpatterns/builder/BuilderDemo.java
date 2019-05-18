package pl.sdacademy.designpatterns.builder;

import java.util.Collection;
import java.util.Collections;

public class BuilderDemo {
  public static void main(String[] args) {
    final Player player = new Player.Builder()
        .withHealth(100)
        .withMana(50)
        .withNick("TotalNerd")
        .withFriends(Collections.emptyList())
        .build();

  }
}
