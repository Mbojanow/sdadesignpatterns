package pl.sdacademy.designpatterns.abstractfactory.builder;

import java.time.Period;
import java.util.List;

public class Player {

  private int health;
  private int mana;
  private String nick;
  private long level;
  private List<String> friends;

  private Player(final int health, final int mana, final String nick, final long level, final List<String> friends) {
    this.health = health;
    this.mana = mana;
    this.nick = nick;
    this.level = level;
    this.friends = friends;
  }

  public static class Builder {

    private int health;
    private int mana;
    private String nick;
    private long level;
    private List<String> friends;

    public Builder withHealth(final int health) {
      this.health = health;
      return this;
    }

    public Builder withMana(final int mana) {
      this.mana = mana;
      return this;
    }

    public Builder withNick(final String nick) {
      this.nick = nick;
      return this;
    }

    public Builder withLevel(final long level) {
      this.level = level;
      return this;
    }

    public Builder withFriends(final List<String> friends) {
      this.friends = friends;
      return this;
    }

    public Player build() {
      return new Player(health, mana, nick, level, friends);
    }

  }
}
