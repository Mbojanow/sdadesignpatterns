package pl.sdacademy.designpatterns.factory;

public interface Game {
    String getName();
    String getType();
    int getMinNumberOfPlayers();
    int getMaxNumberOfPlayers();
    boolean canBePlayedRemotely();
}
