package pl.sdacademy.designpatterns.abstractfactory.adapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import pl.sdacademy.designpatterns.abstractfactory.adapter.systema.SystemAUser;
import pl.sdacademy.designpatterns.abstractfactory.adapter.systema.SystemAUserAdapter;
import pl.sdacademy.designpatterns.abstractfactory.adapter.systemb.SystemBUser;
import pl.sdacademy.designpatterns.abstractfactory.adapter.systemb.SystemBUserAdapter;

public class AdapterDemo {

  public static void main(final String[] args) {
    SystemAUser systemAUser = new SystemAUser("Jan",
        "Jankowski", 21L, Arrays.asList("USER", "SUPERUSER"));
    SystemBUser systemBUser = new SystemBUser("Andrzej Nowak",
        "AN", "33", new HashSet<>());
    List<User> users = new ArrayList<>();
    users.add(new SystemAUserAdapter(systemAUser));
    users.add(new SystemBUserAdapter(systemBUser));

    users.forEach(System.out::println);
  }
}
