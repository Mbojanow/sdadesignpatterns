package pl.sdacademy.designpatterns.factory;

public interface GameFactory {
    // soLid - Liskov substitution rule
    Game create(String name);
}
