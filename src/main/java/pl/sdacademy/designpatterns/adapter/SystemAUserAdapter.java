package pl.sdacademy.designpatterns.adapter;

import java.util.List;

public class SystemAUserAdapter implements User {

  private SystemAUser systemAUser; // obiekt adaptowany (adaptee)

  public SystemAUserAdapter(final SystemAUser systemAUser) {
    this.systemAUser = systemAUser;
  }

  @Override
  public String getFullname() {
    return systemAUser.getFirstName() + " " + systemAUser.getLastName();
  }

  @Override
  public String getUsername() {
    return getFullname();
  }

  @Override
  public Integer getAge() {
    return (int)systemAUser.getAge();
  }

  @Override
  public List<String> getRoles() {
    return systemAUser.getRoles();
  }
}
