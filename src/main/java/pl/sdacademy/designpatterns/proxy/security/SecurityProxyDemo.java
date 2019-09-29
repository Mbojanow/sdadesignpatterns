package pl.sdacademy.designpatterns.proxy.security;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SecurityProxyDemo {
  public static void main(String[] args) {
    final Person personA = Person.builder()
        .email("admin@gmail.com")
        .verified(true)
        .name("Andrzej")
        .role(Role.ADMIN)
        .build();

    final Person personB = Person.builder()
        .name("Ola")
        .role(Role.USER)
        .email("ola@gmail.com")
        .build();

    final Person personC = Person.builder()
        .email("random@gmail.com")
        .verified(false)
        .role(Role.USER)
        .birthDate(LocalDate.now())
        .build();

    final PersonManager personManager = new PersonManagerImpl(new ArrayList<>());
    final PersonManager personManagerProxy = new PersonManagerProxy(personB, personManager);

    personManagerProxy.addPerson(personA);
    personManagerProxy.addPerson(personC);
    System.out.println(personManagerProxy.getAllPeople().size());
  }
}
