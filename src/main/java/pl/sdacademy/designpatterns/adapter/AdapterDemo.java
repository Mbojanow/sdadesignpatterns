package pl.sdacademy.designpatterns.adapter;

import java.util.Arrays;
import java.util.Collections;
import java.util.Set;

public class AdapterDemo {
  public static void main(String[] args) {
    final SystemAUser systemAUser = new SystemAUser("Michał", "Bocian",
        30, Arrays.asList("USER", "ADMIN"));

//    final SystemBUser systemBUser = new SystemBUser("Rafał Nowak", "R.Nowak",
//        "24", Collections.addAll(Set<String> roles , "Admin") );


    final User user = new SystemAUserAdapter(systemAUser);

    System.out.println(user.getFullName());
  }
}
