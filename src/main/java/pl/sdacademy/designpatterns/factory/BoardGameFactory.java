package pl.sdacademy.designpatterns.factory;

import java.util.Random;

public class BoardGameFactory {

    public Game createBoardGame(String name, String producer, Integer numberOfPlayers) {
        Requirements requirements = new Requirements(new Random().nextInt(), numberOfPlayers, name.contains("Legacy"));
        return new BoardGame(name, "Board game", producer, requirements);
    }
}
