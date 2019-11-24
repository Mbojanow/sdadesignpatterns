package pl.sdacademy.designpatterns.proxy.security;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class PersonManagerServiceImpl implements PersonManagerService {

  private List<Person> people = new ArrayList<>();

  @Override
  public void addPerson(final Person person) {
    final boolean emailExists = people.stream()
        .anyMatch(p -> p.getEmail().equals(person.getEmail()));
    if (!emailExists) {
      people.add(person);
    }
  }

  @Override
  public void deletePerson(final String email) {
    handlePersonActionFoundByEmail(email, p -> people.remove(p));
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
    handlePersonActionFoundByEmail(email, p -> p.setVerified(true));
  }

  private void handlePersonActionFoundByEmail(final String email,
                                              final Consumer<Person> action) {
    findPersonByEmail(email).ifPresent(action);
  }

  private Optional<Person> findPersonByEmail(final String email) {
    return people.stream()
        .filter(p -> p.getEmail().equals(email))
        .findFirst();
  }
}
