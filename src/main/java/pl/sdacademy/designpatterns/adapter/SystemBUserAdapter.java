package pl.sdacademy.designpatterns.adapter;

import java.util.ArrayList;
import java.util.List;

public class SystemBUserAdapter implements User{

  public SystemBUserAdapter(final SystemBUser systemBUser) {
    this.systemBUser = systemBUser;
  }

  private SystemBUser systemBUser;

  @Override
  public String getFullName() {
    return systemBUser.getFullName();
  }

  @Override
  public String getuserName() {
    return systemBUser.getDisplayFullName();
  }

  @Override
  public Integer getAge() {
    return Integer.parseInt(systemBUser.getAge());
  }

  @Override
  public List<String> getRoles() {
    return new ArrayList<>(systemBUser.getRoles());
  }
}
