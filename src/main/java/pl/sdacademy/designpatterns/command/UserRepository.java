package pl.sdacademy.designpatterns.command;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    private List<UserData> users = new ArrayList<>();

    public void addUser(final UserData userData) {
        users.add(userData);
    }

    public void removeUser(final UserData userData) {
        users.remove(userData);
    }

    public List<UserData> getUsers() {
        return users;
    }
}
