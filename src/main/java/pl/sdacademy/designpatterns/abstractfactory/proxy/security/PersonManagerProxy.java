package pl.sdacademy.designpatterns.abstractfactory.proxy.security;

import java.util.Collections;
import java.util.List;

public class PersonManagerProxy implements PersonManager {

  private Person person;
  private PersonManager personManager;

  public PersonManagerProxy(final Person person) {
    this.person = person;
    personManager = new PersonManagerImpl();
  }

  private boolean hasManagingPersonAccessType(final AccessType accessType) {
    return this.person.getRole().getAccessType().contains(accessType);
  }

  private boolean hasWriteAccessType() {
    return hasManagingPersonAccessType(AccessType.WRITE);
  }

  private boolean hasReadAccessType() {
    return hasManagingPersonAccessType(AccessType.READ);
  }

  @Override
  public void addPerson(final Person person) {
    if (hasWriteAccessType()) {
      personManager.addPerson(person);
    }
  }

  @Override
  public void deletePerson(final String email) {
    if (hasWriteAccessType()) {
      personManager.deletePerson(email);
    }
  }

  @Override
  public List<Person> getAllPeople() {
    if (hasReadAccessType()) {
      return personManager.getAllPeople();
    }

    return Collections.emptyList();
  }

  @Override
  public boolean isPersonPresent(final String name) {
    if (hasReadAccessType()) {
      return personManager.isPersonPresent(name);
    }
    return false;
  }

  @Override
  public void validateEmail(final String email) {
    if (hasWriteAccessType()) {
      personManager.validateEmail(email);
    }
  }
}
