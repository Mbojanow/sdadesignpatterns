package pl.sdacademy.designpatterns.proxy.security;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

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
    findPersonWithEmail(email).ifPresent(people::remove);

    //2 WERSJA - też okej
//    if (people.stream().anyMatch(p -> p.getEmail().equals(email))) {
//      people.removeIf(p -> p.getEmail().equals(email));
//    }
  }

  private Optional<Person> findPersonWithEmail(final String email) {
    return people.stream()
        .filter(p -> p.getEmail().equals(email))
        .findFirst();
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
    findPersonWithEmail(email)
        .ifPresent(p -> p.setVerified(true));
  }
}
