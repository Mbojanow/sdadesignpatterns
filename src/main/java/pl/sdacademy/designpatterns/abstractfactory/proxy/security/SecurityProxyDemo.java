package pl.sdacademy.designpatterns.abstractfactory.proxy.security;

import java.time.LocalDate;

public class SecurityProxyDemo {

  public static void main(final String[] args) {
    Person admin = new Person("jan", "Nowak", "728-123-123",
        LocalDate.now(), Role.USER, 0, true);

    PersonManager personManager = new PersonManagerProxy(admin);

    Person otherGuy = new Person("Marcin", "Marciniak", "12343123",
        LocalDate.now(), Role.USER, 3, true);
    personManager.addPerson(otherGuy);
    System.out.println(personManager.getAllPeople().size());

  }
}
