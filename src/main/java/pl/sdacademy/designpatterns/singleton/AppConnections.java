package pl.sdacademy.designpatterns.singleton;

import java.util.ArrayList;
import java.util.List;

//singleton typu LAZY
public class AppConnections {
    private static AppConnections instance;

    public static AppConnections getInstance() {
        if (instance == null) {
            instance = new AppConnections();
        }
        return instance;
    }

    private final List<String> connectedUsers;

    private AppConnections() {
        connectedUsers = new ArrayList<>();
    }

    public void addUser(String username) {
        connectedUsers.add(username);
    }

    public List<String> getConnectedUsers() {
        return connectedUsers;
    }
}
