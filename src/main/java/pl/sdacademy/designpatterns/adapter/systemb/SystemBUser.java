package pl.sdacademy.designpatterns.adapter.systemb;

import java.util.List;
import java.util.Set;

import pl.sdacademy.designpatterns.adapter.User;

public class SystemBUser {
  //private String fullName; private String displayName; private String age; private Set<String> roles;
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

  @Override
  public String toString() {
    return "SystemBUser{" +
        "fullName='" + fullName + '\'' +
        ", displayName='" + displayName + '\'' +
        ", age='" + age + '\'' +
        ", roles=" + roles +
        '}';
  }

  public String getFullName() {
    return fullName;
  }

  public void setFullName(final String fullName) {
    this.fullName = fullName;
  }

  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(final String displayName) {
    this.displayName = displayName;
  }

  public String getAge() {
    return age;
  }

  public void setAge(final String age) {
    this.age = age;
  }

  public Set<String> getRoles() {
    return roles;
  }

  public void setRoles(final Set<String> roles) {
    this.roles = roles;
  }
}
