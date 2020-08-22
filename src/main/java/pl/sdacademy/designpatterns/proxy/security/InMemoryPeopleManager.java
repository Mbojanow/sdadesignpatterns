package pl.sdacademy.designpatterns.proxy.security;

import java.util.ArrayList;
import java.util.List;

public class InMemoryPeopleManager implements PeopleManager {

  private final List<Person> people = new ArrayList<>();

  @Override
  public void addPerson(final Person person) {
    if (people.stream().noneMatch(p -> p.getEmail().equals(person.getEmail()))) {
      people.add(person);
    }
  }

  @Override
  public void deletePerson(final String email) {
    people.stream()
        .filter(p -> p.getEmail().equals(email))
        .findFirst().ifPresent(people::remove);

    //2 WERSJA - też okej
//    if (people.stream().anyMatch(p -> p.getEmail().equals(email))) {
//      people.removeIf(p -> p.getEmail().equals(email));
//    }
  }

  @Override
  public List<Person> getAllPeople() {
    return people;
  }

  @Override
  public boolean isPersonPresent(final String name) {
    return people.stream().anyMatch(p -> p.getName().equals(name));
  }

  @Override
  public void validateEmail(final String email) {
    people.stream()
        .filter(p -> p.getEmail().equals(email))
        .findFirst()
        .ifPresent(p -> p.setVerified(true));
  }
}
