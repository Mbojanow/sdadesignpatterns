package pl.sdacademy.designpatterns.abstractfactory.command;

public class UserData {

  private String name;
  private String surname;
  private String email;
  private String password;

  public UserData(final String name, final String surname, final String email, final String password) {
    this.name = name;
    this.surname = surname;
    this.email = email;
    this.password = password;
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

  public String getEmail() {
    return email;
  }

  public void setEmail(final String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(final String password) {
    this.password = password;
  }
}
