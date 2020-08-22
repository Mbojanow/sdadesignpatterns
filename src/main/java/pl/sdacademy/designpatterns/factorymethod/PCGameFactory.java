package pl.sdacademy.designpatterns.factorymethod;

// reprezentuje factory method
public interface PCGameFactory {

  Game createOnlineMMOGame(String name, String producent);
}
