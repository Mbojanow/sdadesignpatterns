package pl.sdacademy.designpatterns.abstractfactory.proxy.security;

import java.util.ArrayList;
import java.util.List;

public class PersonManagerImpl implements PersonManager {

  private List<Person> people = new ArrayList<>();

  @Override
  public void addPerson(final Person person) {
    final boolean emailExists = people.stream()
        .anyMatch(p -> p.getEmail().equals(person.getEmail()));
    if (emailExists) {
      throw new RuntimeException("duplicated email");
    }
    people.add(person);
  }

  @Override
  public void deletePerson(final String email) {
    people.stream()
        .filter(p -> p.getEmail().equals(email))
        .findFirst()
        .ifPresent(p -> people.remove(p));
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
