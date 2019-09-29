package pl.sdacademy.designpatterns.proxy.security;

import java.util.List;
import java.util.Optional;

public class PersonManagerImpl implements PersonManager {

  private List<Person> allUsers;

  public PersonManagerImpl(final List<Person> allUsers) {
    this.allUsers = allUsers;
  }

  @Override
  public void addPerson(final Person person) {
    final boolean emailFound = allUsers.stream().anyMatch(p -> p.getEmail().equals(person.getEmail()));
    if (!emailFound) {
      allUsers.add(person);
    }
  }

  @Override
  public void deletePerson(final String email) {
    final Optional<Person> personOptional = findUserByEmail(email);

    if (personOptional.isPresent()) {
      allUsers.remove(personOptional.get());
    }

  }

  @Override
  public List<Person> getAllPeople() {
    return allUsers;
  }

  @Override
  public boolean isPersonPresent(final String name) {
    return allUsers.stream().anyMatch(p -> p.getName().equals(name));
  }

  @Override
  public void validateEmail(final String email) {
    final Optional<Person> personOptional = findUserByEmail(email);

    if (personOptional.isPresent()) {
      personOptional.get().setVerified(true);
    }
  }

  private Optional<Person> findUserByEmail(final String email) {
    return allUsers.stream()
        .filter(p -> p.getEmail().equals(email))
        .findFirst();
  }
}
