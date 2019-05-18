package pl.sdacademy.designpatterns.adapter;

import java.util.List;

public class SystemAUserAdapter implements User {
  private SystemAUser systemAUser;

  public SystemAUserAdapter(final SystemAUser systemAUser) {
    this.systemAUser = systemAUser;
  }

  @Override
  public String getFullName() {
    return systemAUser.getFirstName() + " " + systemAUser.getLastName();
  }

  @Override
  public String getuserName() {
    return systemAUser.getLastName();
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
