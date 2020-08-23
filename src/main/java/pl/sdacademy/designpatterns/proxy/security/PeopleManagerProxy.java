package pl.sdacademy.designpatterns.proxy.security;

import java.util.List;

public class PeopleManagerProxy implements PeopleManager {

  private final PeopleManager peopleManager;
  private final Person currentPerson;

  public PeopleManagerProxy(final PeopleManager peopleManager, final Person currentPerson) {
    this.peopleManager = peopleManager;
    this.currentPerson = currentPerson;
  }

  @Override
  public void addPerson(final Person person) {
      // czy currentPerson ma WRITE AccessType?
    if (hasAccessType(AccessType.WRITE)) {
      peopleManager.addPerson(person);
    }
  }

  private boolean hasAccessType(final AccessType accessType) {
    return currentPerson.getRole().getAccessTypes().contains(accessType);
  }

  @Override
  public void deletePerson(final String email) {
    if (hasAccessType(AccessType.WRITE)) {
      peopleManager.deletePerson(email);
    }
  }

  @Override
  public List<Person> getAllPeople() {
    if (hasAccessType(AccessType.READ)) {
      return peopleManager.getAllPeople();
    }
    //throw new RuntimeException("Lack of READ access type");
    return List.of();
  }

  @Override
  public boolean isPersonPresent(final String name) {
    if (hasAccessType(AccessType.READ)) {
      return peopleManager.isPersonPresent(name);
    }
    return false;
  }

  @Override
  public void validateEmail(final String email) {
    if (hasAccessType(AccessType.WRITE)) {
      peopleManager.validateEmail(email);
    }
  }
}
