package pl.sdacademy.designpatterns.proxy.security;

import java.util.Collections;
import java.util.List;

public class PersonManagerProxy implements PersonManager {

  // OSOBA aktualnie zarzadzajaca lista uzytkownikow
  private Person managingUser;

  // interfejs do ZARZĄDZANIA użytkownikami
  // NIE JEST TO OSOBA ZARZADZAJACA
  private PersonManager personManager;

  public PersonManagerProxy(final Person managingUser, final PersonManager personManager) {
    this.managingUser = managingUser;
    this.personManager = personManager;
  }

  @Override
  public void addPerson(final Person person) {
    if (hasAccessType(AccessType.WRITE)) {
      personManager.addPerson(person);
    }
  }

  @Override
  public void deletePerson(final String email) {
    if (hasAccessType(AccessType.WRITE)) {
      personManager.deletePerson(email);
    }
  }

  @Override
  public List<Person> getAllPeople() {
    if (hasAccessType(AccessType.READ)) {
      return personManager.getAllPeople();
    }
    return Collections.emptyList();
    // java return List.of();

  }

  @Override
  public boolean isPersonPresent(final String name) {
    if (hasAccessType(AccessType.READ)) {
      return personManager.isPersonPresent(name);
    }
    return false;
  }

  @Override
  public void validateEmail(final String email) {
    if (hasAccessType(AccessType.WRITE)) {
      personManager.validateEmail(email);
    }
  }

  private boolean hasAccessType(final AccessType accessType) {
    return managingUser.getRole().getAccessTypes().contains(accessType);
  }
}
