package pl.sdacademy.designpatterns.factory;

public class MonopolyGameFactory implements GameFactory {
    @Override
    public Game create(String name) {
        return new BoardGame("Monopoly: wersja " + name, "Boring", 2, 4,
                false);
    }
}
