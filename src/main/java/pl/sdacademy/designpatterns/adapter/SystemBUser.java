package pl.sdacademy.designpatterns.adapter;

import java.util.Set;

public class SystemBUser {
  private String fullName;
  private String displayFullName;
  private String age;
  private Set<String> roles;

  public SystemBUser(final String fullName, final String displayFullName, final String age, final Set<String> roles) {
    this.fullName = fullName;
    this.displayFullName = displayFullName;
    this.age = age;
    this.roles = roles;
  }

  public String getFullName() {
    return fullName;
  }

  public void setFullName(final String fullName) {
    this.fullName = fullName;
  }

  public String getDisplayFullName() {
    return displayFullName;
  }

  public void setDisplayFullName(final String displayFullName) {
    this.displayFullName = displayFullName;
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
