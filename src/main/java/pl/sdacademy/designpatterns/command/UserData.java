package pl.sdacademy.designpatterns.command;

public class UserData {

  private String email;
  private String name;
  private String surname;
  private String password;

  public UserData(final String email, final String name, final String surname, final String password) {
    this.email = email;
    this.name = name;
    this.surname = surname;
    this.password = password;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(final String email) {
    this.email = email;
  }

  public String getName() {
    return name;
  }

  public void setName(final String name) {
    this.name = name;
  }

  public String getSurname() {
    return surname;
  }

  public void setSurname(final String surname) {
    this.surname = surname;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(final String password) {
    this.password = password;
  }
}
