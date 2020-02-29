package pl.sdacademy.designpatterns.builder;

import java.util.List;

public class Player {
  private Integer health;
  private Integer mana;
  private Long level;
  private String username;
  private List<String> friends;

  protected Player(final Integer health, final Integer mana, final Long level, final String username, final List<String> friends) {
    this.health = health;
    this.mana = mana;
    this.level = level;
    this.username = username;
    this.friends = friends;
  }

  public Integer getHealth() {
    return health;
  }

  public void setHealth(final Integer health) {
    this.health = health;
  }

  public Integer getMana() {
    return mana;
  }

  public void setMana(final Integer mana) {
    this.mana = mana;
  }

  public Long getLevel() {
    return level;
  }

  public void setLevel(final Long level) {
    this.level = level;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(final String username) {
    this.username = username;
  }

  public List<String> getFriends() {
    return friends;
  }

  public void setFriends(final List<String> friends) {
    this.friends = friends;
  }

  public static class Builder {
    private Integer health;
    private Integer mana;
    private Long level;
    private String username;
    private List<String> friends;

    public Builder withHealth(final Integer health) {
      this.health = health;
      return this;
    }

    public Builder withMana(final Integer mana) {
      this.mana = mana;
      return this;
    }

    public Builder withLevel(final Long level) {
      this.level = level;
      return this;
    }

    public Builder withUsername(final String username) {
      this.username = username;
      return this;
    }

    public Builder withFriends(final List<String> friends) {
      this.friends = friends;
      return this;
    }

    public Player build() {
      // klasa w klasie -> wykorzystujemy protected konstruktor
      return new Player(this.health, this.mana, this.level, this.username, this.friends);
    }

  }
}
