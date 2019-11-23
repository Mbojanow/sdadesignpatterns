package pl.sdacademy.designpatterns.builder;

import java.util.List;

public class Player {
  private String nick;
  private int health;
  private int mana;
  private long level;
  private List<String> friends;

  protected Player(final String nick, final int health, final int mana, final long level, final List<String> friends) {
    this.nick = nick;
    this.health = health;
    this.mana = mana;
    this.level = level;
    this.friends = friends;
  }

  public String getNick() {
    return nick;
  }

  public void setNick(final String nick) {
    this.nick = nick;
  }

  public int getHealth() {
    return health;
  }

  public void setHealth(final int health) {
    this.health = health;
  }

  public int getMana() {
    return mana;
  }

  public void setMana(final int mana) {
    this.mana = mana;
  }

  public long getLevel() {
    return level;
  }

  public void setLevel(final long level) {
    this.level = level;
  }

  public List<String> getFriends() {
    return friends;
  }

  public void setFriends(final List<String> friends) {
    this.friends = friends;
  }

  // klasa w klasie!
  public static class Builder {
    private String nick;
    private int health;
    private int mana;
    private long level;
    private List<String> friends;

    public Builder withNick(final String nick) {
      this.nick = nick;
      return this;
    }

    public Builder withHealth(final int health) {
      this.health = health;
      return this;
    }

    public Builder withMana(final int mana) {
      this.mana = mana;
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
      return new Player(this.nick, this.health,
          this.mana, this.level, this.friends);
    }
  }
}
