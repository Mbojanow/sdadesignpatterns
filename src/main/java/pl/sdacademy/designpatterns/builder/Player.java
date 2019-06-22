package pl.sdacademy.designpatterns.builder;

import java.util.List;

public class Player {

  private String nick;
  private int health;
  private int mana;
  private int level;
  private List<String> friends;

  private Player(final String nick, final int health, final int mana, final int level, final List<String> friends) {
    this.nick = nick;
    this.health = health;
    this.mana = mana;
    this.level = level;
    this.friends = friends;
  }

  @Override
  public String toString() {
    return "Player{" +
        "nick='" + nick + '\'' +
        ", health=" + health +
        ", mana=" + mana +
        ", level=" + level +
        ", friends=" + friends +
        '}';
  }

  public static class Builder {
    private String nick;
    private int health;
    private int mana;
    private int level;
    private List<String> friends;

    public Builder withNick(String nick) {
      this.nick = nick;
      return this;
    }

    public Builder withHealth(int health) {
      this.health = health;
      return this;
    }

    public Builder withMana(int mana) {
      this.mana = mana;
      return this;
    }

    public Builder withLevel(int level) {
      this.level = level;
      return this;
    }

    public Builder withFriends(List<String> friends) {
      this.friends = friends;
      return this;
    }

    public Player build() {
      return new Player(nick, health, mana, level, friends);
    }

  }
}
