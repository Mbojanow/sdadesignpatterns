package pl.sdacademy.designpatterns.abstractfactory.proxy.security;

import java.util.ArrayList;
import java.util.List;

public class PersonManagerImpl implements PersonManager {

  private List<Person> people = new ArrayList<>();

  @Override
  public void addPerson(final Person person) {
    // cała metoda jako jeden stream hint: use 'orElseThrow'
    final boolean isEmailDuplicated = people.stream()
        .anyMatch(p -> person.getEmail().equals(p.getEmail()));
    if (isEmailDuplicated) {
      throw new RuntimeException();
    }
    people.add(person);
  }

  @Override
  public void deletePerson(final String email) {
    people.stream().filter(person -> person.getEmail().equals(email))
        .findFirst().ifPresent(person -> people.remove(person));
  }

  @Override
  public List<Person> getAllPeople() {
    return people;
  }

  @Override
  public boolean isPersonPresent(final String name) {
    return people.stream().anyMatch(person -> person.getName().equals(name));
  }

  @Override
  public void validateEmail(final String email) {
    people.stream().filter(person -> person.getEmail().equals(email))
        .findFirst().ifPresent(person -> person.setVerified(true));
  }
}
