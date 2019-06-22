package pl.sdacademy.designpatterns.proxy;

import java.time.LocalDate;

import pl.sdacademy.designpatterns.proxy.security.Person;
import pl.sdacademy.designpatterns.proxy.security.PersonManager;
import pl.sdacademy.designpatterns.proxy.security.PersonManagerProxy;
import pl.sdacademy.designpatterns.proxy.security.Role;
import pl.sdacademy.designpatterns.proxy.security.SimplePersonManager;

//*@HasRole("ADMIN")
public class ProxyDemo {

  public static void main(String[] args) {
    final ConfigLoader configLoader = new ConfigLoaderProxy(new DatabaseConfigLoader("jdbc:h2:mem:testdb"));

    configLoader.load();
    System.out.println("XXX");
    configLoader.load();
    System.out.println("XXX");
    configLoader.load();

    final long timeStamp = System.currentTimeMillis();
    final long msInYear = 365L * 24 * 60 * 60 * 1000;
    System.out.println(timeStamp / msInYear);


    final Person admin = new Person("Andrzej", "admin@gmail.com", "123123123", LocalDate.now(),
        Role.ADMIN, 2, true);
    final Person user = new Person("Michal", "user@gmail.com", "543§23432", LocalDate.now(),
        Role.USER, 0, false);

    final PersonManager personManager = new PersonManagerProxy(new SimplePersonManager(), user);
    personManager.addPerson(admin);

    personManager.getAllPeople().forEach(System.out::println);
  }
}
