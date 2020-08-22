package pl.sdacademy.designpatterns.adapter;

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

  public String getLastName() {
    return lastName;
  }

  public long getAge() {
    return age;
  }

  public List<String> getRoles() {
    return roles;
  }
}
