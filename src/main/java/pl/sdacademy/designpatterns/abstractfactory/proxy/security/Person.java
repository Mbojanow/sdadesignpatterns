package pl.sdacademy.designpatterns.abstractfactory.proxy.security;

import java.time.LocalDate;

public class Person {

  private String name;
  private String email;
  private String phone;
  private LocalDate birthDate;
  private Role role;
  private int numOfLogins;
  private boolean verified;

  public Person(final String name, final String email, final String phone, final LocalDate birthDate, final Role role, final int numOfLogins,
                final boolean verified) {
    this.name = name;
    this.email = email;
    this.phone = phone;
    this.birthDate = birthDate;
    this.role = role;
    this.numOfLogins = numOfLogins;
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

  public String getPhone() {
    return phone;
  }

  public void setPhone(final String phone) {
    this.phone = phone;
  }

  public LocalDate getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(final LocalDate birthDate) {
    this.birthDate = birthDate;
  }

  public Role getRole() {
    return role;
  }

  public void setRole(final Role role) {
    this.role = role;
  }

  public int getNumOfLogins() {
    return numOfLogins;
  }

  public void setNumOfLogins(final int numOfLogins) {
    this.numOfLogins = numOfLogins;
  }

  public boolean isVerified() {
    return verified;
  }

  public void setVerified(final boolean verified) {
    this.verified = verified;
  }
}
