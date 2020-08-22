package pl.sdacademy.designpatterns.proxy.security;

public class Person {
  private String name;
  private String email;
  private Role role;
  private boolean verified;

  public Person(final String name, final String email, final Role role, final boolean verified) {
    this.name = name;
    this.email = email;
    this.role = role;
    this.verified = verified;
  }

  public String getName() {
    return name;
  }

  public void setName(final String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(final String email) {
    this.email = email;
  }

  public Role getRole() {
    return role;
  }

  public void setRole(final Role role) {
    this.role = role;
  }

  public boolean isVerified() {
    return verified;
  }

  public void setVerified(final boolean verified) {
    this.verified = verified;
  }
}
