package pl.sdacademy.designpatterns.proxy.security;

import java.time.LocalDate;

public class SecurityDemo {
  public static void main(String[] args) {
    final PersonManagerService realService = new PersonManagerServiceImpl();
    final Person personA = new Person("Andrzej",
        "andrzej@gmail.com", "729132712", LocalDate.now(),
        Role.USER, 3, false);
    final Person personB = new Person("Grażyna", "grażka@test.com",
        "31321", LocalDate.now(), Role.ADMIN, 1, true);

    final PersonManagerService proxy
        = new PersonManagerServiceSecurityProxy(realService, personB);

    proxy.addPerson(personA);
    System.out.println(proxy.getAllPeople().size());
  }
}
