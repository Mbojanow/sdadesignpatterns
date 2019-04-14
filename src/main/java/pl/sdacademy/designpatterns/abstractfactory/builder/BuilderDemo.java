package pl.sdacademy.designpatterns.abstractfactory.builder;

import java.util.Collections;

public class BuilderDemo {

  public static void main(final String[] args) {
    final Player playerA = new Player.Builder()
        .withHealth(100)
        .withMana(100)
        .withNick("THE KILLER")
        .withFriends(Collections.emptyList())
        .build();

    final Player playerB = new Player.Builder()
        .withLevel(10)
        .withHealth(50)
        .withMana(90)
        .build();


    Book.builder().author("Michal").pagesNum(13).build();
  }
}
