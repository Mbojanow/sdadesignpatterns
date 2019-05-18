package pl.sdacademy.designpatterns.security;

import java.util.Collections;
import java.util.List;

public class PersonManagerProxy implements PersonManager {

  private Person managingPerson;
  private PersonManager personManager = new PersonManagerImpl();

  public PersonManagerProxy(final Person managingPerson) {

    this.managingPerson = managingPerson;

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
  private boolean hasAccessType(final AccessType accessType){
    return managingPerson.getRole().getAccessTypes().contains(accessType);

  }
}
