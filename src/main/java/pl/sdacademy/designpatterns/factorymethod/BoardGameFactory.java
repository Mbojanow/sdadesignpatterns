package pl.sdacademy.designpatterns.factorymethod;

public interface BoardGameFactory {

  Game createEscapeRoomGame(String name, String publisher);
}
