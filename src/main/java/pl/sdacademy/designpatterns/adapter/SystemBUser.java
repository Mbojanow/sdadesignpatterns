package pl.sdacademy.designpatterns.adapter;

import java.util.Set;

public class SystemBUser {
  private String fullName;
  private String displayName;
  private String age;
  private Set<String> roles;

  public SystemBUser(final String fullName, final String displayName, final String age, final Set<String> roles) {
    this.fullName = fullName;
    this.displayName = displayName;
    this.age = age;
    this.roles = roles;
  }

  public String getFullName() {
    return fullName;
  }

  public String getDisplayName() {
    return displayName;
  }

  public String getAge() {
    return age;
  }

  public Set<String> getRoles() {
    return roles;
  }
}
