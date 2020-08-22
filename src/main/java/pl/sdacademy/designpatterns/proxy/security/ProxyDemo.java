package pl.sdacademy.designpatterns.proxy.security;

public class ProxyDemo {
  public static void main(String[] args) {
    final Person personA = new Person("Adam", "adam@test.com", Role.USER, false);
    final Person personB = new Person("Ewa", "ewa@test.com", Role.ADMIN, false);

    PeopleManager peopleManager = new InMemoryPeopleManager();
    PeopleManager proxy = new PeopleManagerProxy(peopleManager, personA);

    proxy.addPerson(personB);
    proxy.validateEmail("ewa@test.com");

    System.out.println(peopleManager.getAllPeople().size());
  }
}
