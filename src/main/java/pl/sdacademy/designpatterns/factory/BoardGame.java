package pl.sdacademy.designpatterns.factory;

public class BoardGame implements Game {

    private String name;
    private String type;
    private int minNumberOfPlayers;
    private int maxNumberOfPlayers;
    private boolean playedRemotely;

    public BoardGame(String name, String type, int minNumberOfPlayers, int maxNumberOfPlayers, boolean playedRemotely) {
        this.name = name;
        this.type = type;
        this.minNumberOfPlayers = minNumberOfPlayers;
        this.maxNumberOfPlayers = maxNumberOfPlayers;
        this.playedRemotely = playedRemotely;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public int getMinNumberOfPlayers() {
        return minNumberOfPlayers;
    }

    @Override
    public int getMaxNumberOfPlayers() {
        return maxNumberOfPlayers;
    }

    @Override
    public boolean canBePlayedRemotely() {
        return playedRemotely;
    }
}
