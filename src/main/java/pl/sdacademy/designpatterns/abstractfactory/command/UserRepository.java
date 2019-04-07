package pl.sdacademy.designpatterns.abstractfactory.command;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

  private List<UserData> users = new ArrayList<>();

  public void addUser(final UserData userData) {
    if (!users.contains(userData)) {
      users.add(userData);
    }
  }

  public void deleteUser(final UserData userData) {
    users.remove(userData);
  }

  public void printAllNames() {
    users.forEach(user -> System.out.println(user.getName()));
  }
}
