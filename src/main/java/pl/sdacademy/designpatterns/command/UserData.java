package pl.sdacademy.designpatterns.command;

// POJO - plain old java object
// ma tylko: pola, konstruktor, gettery i setter
public class UserData {
  private String name;
  private String email;
  private String password;

  public UserData(final String name, final String email, final String password) {
    this.name = name;
    this.email = email;
    this.password = password;
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

  public String getPassword() {
    return password;
  }

  public void setPassword(final String password) {
    this.password = password;
  }
}
