package pl.sdacademy.designpatterns.adapter.systema;

import java.util.List;

public class SystemAUser {
  private String firstName;
  private String lastName;
  private long age;
  private List<String> roles;

  public SystemAUser(final String firstName, final String lastName, final long age, final List<String> roles) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.roles = roles;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(final String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(final String lastName) {
    this.lastName = lastName;
  }

  public long getAge() {
    return age;
  }

  public void setAge(final long age) {
    this.age = age;
  }

  public List<String> getRoles() {
    return roles;
  }

  public void setRoles(final List<String> roles) {
    this.roles = roles;
  }

  @Override
  public String toString() {
    return "SystemAUser{" +
        "firstName='" + firstName + '\'' +
        ", lastName='" + lastName + '\'' +
        ", age=" + age +
        ", roles=" + roles +
        '}';
  }
}
