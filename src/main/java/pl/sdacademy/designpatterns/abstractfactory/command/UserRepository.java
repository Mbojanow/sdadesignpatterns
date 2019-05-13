package pl.sdacademy.designpatterns.abstractfactory.command;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UserRepository {

  private List<UserData> users = new ArrayList<>();

  public void addUser(final UserData userData) {
    final boolean emailExists = users.stream()
        .anyMatch(user -> user.getEmail().equals(userData.getEmail()));
    if (!emailExists) {
      users.add(userData);
      return;
    }
    System.out.println("email exists, user not inserted");
  }

  public void removeUser(final UserData userData) {
    users.remove(userData);
  }

  @Override
  public String toString() {
    return users.stream()
        .map(UserData::getName)
        .collect(Collectors.joining(" "));
  }
}
