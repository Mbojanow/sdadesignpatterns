package pl.sdacademy.designpatterns.builder;

import java.util.List;

public class BuilderDemo {
  public static void main(String[] args) {
    Player player = new Player.Builder()
        .withHealth(100)
        .withNick("DESTROYER")
        .withLevel(1)
        .withFriends(List.of())
        .build();

//    new Player.Builder().withHealth(100).withNick("DESTROYER").withLevel(1).withFriends(List.of()).build();

//    List.of(1, 2, 3).stream()
//        .filter(value -> value % 2 == 0)
//        .forEach(System.out::println);

    // new Player("asd", 1, 2 ,3L, List.of()); - NIE DA SIĘ - KONSTRUKTOR PRYWATNY, WYMUSZAMY KORZYSTANIE Z BUILDERA

    System.out.println(player);

    Person person = Person.builder()
        .name("Adam")
        .surname("Adamski")
        .age(15)
        .build();
    System.out.println(person);
  }
}
