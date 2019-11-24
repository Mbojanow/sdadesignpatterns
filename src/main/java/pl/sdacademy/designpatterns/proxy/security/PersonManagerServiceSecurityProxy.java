package pl.sdacademy.designpatterns.proxy.security;

import java.util.List;

public class PersonManagerServiceSecurityProxy implements PersonManagerService {

  private PersonManagerService personManagerService;
  private Person managingPerson;

  public PersonManagerServiceSecurityProxy(final PersonManagerService personManagerService, final Person managingPerson) {
    this.personManagerService = personManagerService;
    this.managingPerson = managingPerson;
  }

  @Override
  public void addPerson(final Person person) {
    if (hasAccessType(AccessType.WRITE)) {
      personManagerService.addPerson(person);
    }
  }

  private boolean hasAccessType(final AccessType accessType) {
    return managingPerson.getRole().getAccessTypes().contains(accessType);
  }

  @Override
  public void deletePerson(final String email) {
    if (hasAccessType(AccessType.WRITE)) {
      personManagerService.deletePerson(email);
    }
  }

  @Override
  public List<Person> getAllPeople() {
    if (hasAccessType(AccessType.READ)) {
      return personManagerService.getAllPeople();
    }
    return List.of();
  }

  @Override
  public boolean isPersonPresent(final String name) {
    if (hasAccessType(AccessType.READ)) {
      return personManagerService.isPersonPresent(name);
    }
    return false;
  }

  @Override
  public void validateEmail(final String email) {
    if (hasAccessType(AccessType.WRITE)) {
      personManagerService.validateEmail(email);
    }
  }
}
