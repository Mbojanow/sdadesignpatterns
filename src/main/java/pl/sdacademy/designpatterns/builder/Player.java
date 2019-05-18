package pl.sdacademy.designpatterns.builder;

import java.util.List;

public class Player {
  private int health;
  private int mana;
  private String nick;
  private List<String> friends;

  public Player(final int health, final int mana, final String nick, final List<String> friends) {
    this.health = health;
    this.mana = mana;
    this.nick = nick;
    this.friends = friends;
  }


  public int getHealth() {
    return health;
  }

  public int getMana() {
    return mana;
  }

  public String getNick() {
    return nick;
  }

  public List<String> getFriends() {
    return friends;
  }

  public void setHealth(final int healt) {
    this.health = healt;
  }

  public void setMana(final int mana) {
    this.mana = mana;
  }

  public void setNick(final String nick) {
    this.nick = nick;
  }

  public void setFriends(final List<String> friends) {
    this.friends = friends;
  }

  public static class Builder {
    private int health;
    private int mana;
    private String nick;
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

    public Builder withFriends(final List<String> friends) {
      this.friends = friends;
      return this;
    }
    public Player build(){
      return new Player (health, mana, nick, friends);
    }

  }


}

