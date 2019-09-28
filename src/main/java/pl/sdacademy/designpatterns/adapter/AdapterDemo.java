package pl.sdacademy.designpatterns.adapter;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Set;

import pl.sdacademy.designpatterns.adapter.systema.SystemAUser;
import pl.sdacademy.designpatterns.adapter.systema.SystemAUserAdapter;
import pl.sdacademy.designpatterns.adapter.systemb.SystemBUser;
import pl.sdacademy.designpatterns.adapter.systemb.SystemBUserAdapter;

public class AdapterDemo {

  public static void main(String[] args) {
    final SystemAUser systemAUser = new SystemAUser("Andrzej", "Nowak", 22L,
        List.of("ADMIN") // java 11 style
        /*Collections.singletonList("ADMIN") <- java8 style */);
    final SystemBUser systemBUser = new SystemBUser("Ola Nowak", "THEKILLA",
        "25", Set.of("ADMIN", "CEO"));

    final SystemAUser systemAUser2 = new SystemAUser("Andrzej2", "Nowak2", 22L,
        List.of("USER"));

    final List<User> users = new ArrayList<>();
    users.add(new SystemAUserAdapter(systemAUser));
    users.add(new SystemBUserAdapter(systemBUser));
    users.add(new SystemAUserAdapter(systemAUser2));

    users.forEach(user -> {
      System.out.println(user.getUsername());
      System.out.println(user.getFullname());
      System.out.println(user.getAge());
      System.out.println(user.getRoles());
    });

    System.out.println(new Date().getTime());
    System.out.println(LocalDateTime.now().toEpochSecond(ZoneOffset.UTC));
  }
}
