package pl.sdacademy.designpatterns.factorymethod;

public class EscapeRoomBoardGameFactory implements BoardGameFactory {
  @Override
  public Game createEscapeRoomGame(final String name, final String publisher) {
    Requirements requirements = new Requirements(true, 1, 1, 4);
    return new BoardGame(name, "Escape Room", publisher, requirements);
  }
}
