package pl.sdacademy.designpatterns.builder;

import java.util.List;

public class BuilderDemo {
    public static void main(String[] args) {
        //Player asd = new Player(2, 3, 4L, "asd", List.of()); - niewygodne
        Player player = new Player.Builder()
                .withUsername("Destroyer")
                .withHealth(100)
                .withLevel(1L)
                .withFriends(List.of())
                .build();

        System.out.println(player);

        Shoe shoe = Shoe.builder()
                .color("red")
                .size(42)
                .brand("Nike")
                .build();
        System.out.println(shoe);
    }
}
