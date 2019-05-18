package pl.sdacademy.designpatterns.security;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PersonManagerImpl implements PersonManager {

  List<Person> people = new ArrayList<>();

  @Override
  public void addPerson(final Person person) {
    final boolean emailExists = people.stream()
        .anyMatch(p -> p.getEmail().equals(person.getEmail()));
    if (!emailExists){
      people.add(person);
    }
  }

  @Override
  public void deletePerson(final String email) {
    getPersonByEmail(email).ifPresent(p ->people.remove(p));

  }

  @Override
  public List<Person> getAllPeople() {
    return people;
  }

  @Override
  public boolean isPersonPresent(final String name) {

    return people.stream()
        .anyMatch(p -> p.getName().equals(name));
  }

  @Override
  public void validateEmail(final String email) {
    final Optional<Person> person = getPersonByEmail(email);
    person.ifPresent(p -> p.setVerified(true));

  }
  private Optional<Person> getPersonByEmail (final String email){
    return people.stream()
        .filter(p -> p.getEmail().equals(email)).findAny();
  }
}
