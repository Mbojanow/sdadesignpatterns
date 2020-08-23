package pl.sdacademy.designpatterns.command;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

  private final List<UserData> users = new ArrayList<>();

  public void addUser(UserData userData) {
    users.add(userData);
  }

  public void removeUser(UserData userData) {
    users.remove(userData);
  }

  public boolean usernameWithEmailExists(final String email) {
    return users.stream().anyMatch(userData -> userData.getEmail().equals(email));
  }
}
