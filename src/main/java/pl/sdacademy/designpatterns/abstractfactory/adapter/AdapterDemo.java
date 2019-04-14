package pl.sdacademy.designpatterns.abstractfactory.adapter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import pl.sdacademy.designpatterns.abstractfactory.adapter.systema.SystemAUser;
import pl.sdacademy.designpatterns.abstractfactory.adapter.systema.SystemAUserAdapter;
import pl.sdacademy.designpatterns.abstractfactory.adapter.systemb.SystemBUser;
import pl.sdacademy.designpatterns.abstractfactory.adapter.systemb.SystemBUserAdapter;

public class AdapterDemo {

  public static void main(final String[] args) {
    final List<User> users = new ArrayList<>();

    final SystemAUser systemAUser = new SystemAUser("Michal",
        "Nowak", 15L, Collections.singletonList("USER"));
    final SystemBUser systemBUser = new SystemBUser("Andrzej Nowak",
        "Andrju", "22", Collections.singleton("ADMIN"));

    users.add(new SystemAUserAdapter(systemAUser));
    users.add(new SystemBUserAdapter(systemBUser));

    users.forEach(user -> System.out.println(user.getFullname()));
  }
}
