package pl.sdacademy.designpatterns.builder;

public class PlayerDemo {
  public static void main(String[] args) {
    final Player player = new Player.Builder()
        .withLevel(15L)
        .withNick("THEKILLER")
        .withMana(100)
        .build();
  }
}
