package pl.sdacademy.designpatterns.abstractfactory.proxy.security;

import java.time.LocalDate;

public class ProxyDemo {

  public static void main(final String[] args) {

    final Person person = new Person("Andrzej",
        "test@gmail.com",
        "123456789",
        LocalDate.now(),
        0,
        false,
        Role.USER);

    final Person admin = new Person("Rychu",
        "rychu@gmail.com",
        "1234566789",
        LocalDate.now(),
        2, true, Role.ADMIN);

    final PersonManager personManager = new PersonManagerProxy(admin);
    personManager.addPerson(person);
    System.out.println(personManager.getAllPeople().size());

  }
}
