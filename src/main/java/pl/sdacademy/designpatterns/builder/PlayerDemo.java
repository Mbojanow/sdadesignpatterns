package pl.sdacademy.designpatterns.builder;

import java.util.List;

public class PlayerDemo {
    public static void main(String[] args) {
        // new Player(); - nie da się
        Player player = new Player.Builder()
                .withNick("Andrzej")
                .withHealth(100)
                .withLevel(1)
                .withFriends(List.of())
                .build();
        System.out.println(player);
    }
}
