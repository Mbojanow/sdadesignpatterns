package pl.sdacademy.designpatterns.abstractfactory.adapter.systema;

import java.util.List;

import pl.sdacademy.designpatterns.abstractfactory.adapter.User;

public class SystemAUserAdapter implements User {

  private SystemAUser systemAUser;

  public SystemAUserAdapter(final SystemAUser systemAUser) {
    this.systemAUser = systemAUser;
  }

  @Override
  public String getFullname() {
    return systemAUser.getFirstName() + " " + systemAUser.getLastName();
  }

  @Override
  public String getUsername() {
    return systemAUser.getLastName();
  }

  @Override
  public Integer getAge() {
    return Integer.valueOf(String.valueOf(systemAUser.getAge()));
  }

  @Override
  public List<String> getRoles() {
    return systemAUser.getRoles();
  }
}
