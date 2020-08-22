package pl.sdacademy.designpatterns.factorymethod;

import java.util.List;

public class FactoryDemo {
  public static void main(String[] args) {
    PCGameFactory pcGameFactory = new MMOPCGameFactory();
    final Game game = pcGameFactory.createOnlineMMOGame("World of Warcraft", "Blizzard Activition");

    System.out.println(game.getName());
    System.out.println(game.getProducer());
    System.out.println(game.getRequirements());
    System.out.println(game.getType());

    BoardGameFactory boardGameFactory = new EscapeRoomBoardGameFactory();
    Game boardGame = boardGameFactory.createEscapeRoomGame("Exit", "REBEL");

    System.out.println(boardGame.getName());
    System.out.println(boardGame.getProducer());
    System.out.println(boardGame.getRequirements());
    System.out.println(boardGame.getType());

    List<Game> games = List.of(boardGame, game);
  }
}
