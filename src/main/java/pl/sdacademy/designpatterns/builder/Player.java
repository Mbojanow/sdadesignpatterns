package pl.sdacademy.designpatterns.builder;

import java.util.List;

public class Player {

    private Integer health;
    private Integer mana;
    private Long level;
    private String username;
    private List<String> friends;

    protected Player(Integer health, Integer mana, Long level, String username, List<String> friends) {
        this.health = health;
        this.mana = mana;
        this.level = level;
        this.username = username;
        this.friends = friends;
    }

    public Integer getHealth() {
        return health;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }

    public Integer getMana() {
        return mana;
    }

    public void setMana(Integer mana) {
        this.mana = mana;
    }

    public Long getLevel() {
        return level;
    }

    public void setLevel(Long level) {
        this.level = level;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<String> getFriends() {
        return friends;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }

    public static class Builder {
        private Integer health;
        private Integer mana;
        private Long level;
        private String username;
        private List<String> friends;

        //build party
        public Builder withHealth(Integer health) {
            this.health = health;
            return this;
        }

        public Builder withMana(Integer mana) {
            this.mana = mana;
            return this;
        }

        public Builder withLevel(Long level) {
            this.level = level;
            return this;
        }

        public Builder withUsername(String username) {
            this.username = username;
            return this;
        }

        public Builder withFriends(List<String> friends) {
            this.friends = friends;
            return this;
        }

        public Player build() {
            return new Player(health, mana, level, username, friends);
        }
    }
}
