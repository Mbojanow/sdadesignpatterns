package pl.sdacademy.designpatterns.command;

import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.UserDataHandler;

public class UserRepository {

  private List<UserBase> users = new ArrayList<>();

  public void addUser(final UserBase user) {
    users.add(user);
  }

  public void removeUser(final UserBase user) {
    users.remove(user);
  }

  public List<UserBase> getUsers() {
    return users;
  }
}
