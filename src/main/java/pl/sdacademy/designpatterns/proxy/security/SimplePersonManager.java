package pl.sdacademy.designpatterns.proxy.security;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class SimplePersonManager implements PersonManager {

  private List<Person> users = new ArrayList<>();

  @Override
  public void addPerson(final Person person) {
//    boolean exists = false;
//    for (final Person p : users) {
//      if (p.getEmail().equalsIgnoreCase(person.getEmail())) {
//        exists = true;
//        break;
//      }
//    }

    final boolean emailExists = users.stream().anyMatch(p -> p.getEmail().equalsIgnoreCase(person.getEmail()));
    if (!emailExists) {
      users.add(person);
    } else {
      //tutaj powinien byc wyspecyfikowany typ wyjątku
      throw new RuntimeException("User with given email already exists");
    }
  }

  @Override
  public void deletePerson(final String email) {
    //final Optional<Person> personToDelete =
    users.stream()
        .filter(p -> p.getEmail().equalsIgnoreCase(email))
        .findFirst()
        .ifPresent(p -> users.remove(p));

//    if (personToDelete.isPresent()) {
//      users.remove(personToDelete.get());
//    }
  }

  @Override
  public List<Person> getAllPeople() {
    return users;
  }

  @Override
  public boolean isPersonPresent(final String name) {
    //Stream.of("asd", "qwe", "dsdsa")
    return users.stream().anyMatch(p -> p.getName().equalsIgnoreCase(name));
  }

  @Override
  public void validateEmail(final String email) {
    users.stream()
        .filter(p -> p.getEmail().equalsIgnoreCase(email))
        .findFirst()
        .ifPresent(p -> p.setVerified(true));
  }
}
