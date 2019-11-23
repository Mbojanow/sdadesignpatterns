package pl.sdacademy.designpatterns.adapter.systemb;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import pl.sdacademy.designpatterns.adapter.User;

public class SystemBUserAdapter implements User {

  private SystemBUser systemBUser;

  public SystemBUserAdapter(final SystemBUser systemBUser) {
    this.systemBUser = systemBUser;
  }

  @Override
  public String getFullname() {
    return systemBUser.getFullName();
  }

  @Override
  public String getUsername() {
    return systemBUser.getDisplayName();
  }

  @Override
  public Integer getAge() {
    return Integer.valueOf(systemBUser.getAge());
  }

  @Override
  public List<String> getRoles() {
    //List.copyOf(systemBUser.getRoles());
    //systemBUser.getRoles().stream().collect(Collectors.toList());
    return new ArrayList<>(systemBUser.getRoles());
  }

  @Override
  public String toString() {
    return "SystemBUserAdapter{" +
        "systemBUser=" + systemBUser +
        '}';
  }
}
