package pl.sdacademy.designpatterns.builder;

import java.util.List;

public class Player {
    private int health;
    private int mana;
    private String nick;
    private long level;
    private List<String> friends;

    private Player(int health, int mana, String nick, long level, List<String> friends) {
        this.health = health;
        this.mana = mana;
        this.nick = nick;
        this.level = level;
        this.friends = friends;
    }

    @Override
    public String toString() {
        return "Player{" +
                "health=" + health +
                ", mana=" + mana +
                ", nick='" + nick + '\'' +
                ", level=" + level +
                ", friends=" + friends +
                '}';
    }

    public static class Builder {
        private int health;
        private int mana;
        private String nick;
        private long level;
        private List<String> friends;

        public Builder withHealth(int health) {
            this.health = health;
            return this;
        }

        public Builder withMana(int mana) {
            this.mana = mana;
            return this;
        }

        public Builder withNick(String nick) {
            this.nick = nick;
            return this;
        }

        public Builder withLevel(long level) {
            this.level = level;
            return this;
        }

        public Builder withFriends(List<String> friends) {
            this.friends = friends;
            return this;
        }

        public Player build() {
            return new Player(health, mana, nick, level, friends);
        }

    }

}
