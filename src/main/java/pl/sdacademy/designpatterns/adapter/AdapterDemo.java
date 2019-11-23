package pl.sdacademy.designpatterns.adapter;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import pl.sdacademy.designpatterns.adapter.systema.SystemAUser;
import pl.sdacademy.designpatterns.adapter.systema.SystemAUserAdapter;
import pl.sdacademy.designpatterns.adapter.systemb.SystemBUser;
import pl.sdacademy.designpatterns.adapter.systemb.SystemBUserAdapter;

public class AdapterDemo {
  public static void main(String[] args) {
    final SystemAUser systemAUser = new SystemAUser("Andrzej",
        "Nowak", 25, List.of("NORMAL_USER"));
    final SystemBUser systemBUser = new SystemBUser("Grażyna Nowak",
        "Grażyna", "33", Set.of("ADMIN"));

    final List<User> users = new ArrayList<>();
    // wrzucic uzytkownikow do listy
    // wyswietlic zawartosc za pomoca forEach

    users.add(new SystemAUserAdapter(systemAUser));
    users.add(new SystemBUserAdapter(systemBUser));
    users.forEach(user -> System.out.println(user.toString()));
  }
}
