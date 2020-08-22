package pl.sdacademy.designpatterns.adapter;

import java.util.List;

public class AdapterDemo {
  public static void main(String[] args) {
    SystemAUser systemAUser = new SystemAUser("Adam", "Adamski", 99L, List.of("USER"));

    User user = new SystemAUserAdapter(systemAUser);
  }
}
