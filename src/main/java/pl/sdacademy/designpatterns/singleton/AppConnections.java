package pl.sdacademy.designpatterns.singleton;

import java.util.ArrayList;
import java.util.List;

// Singleton TYPU LAZY
public class AppConnections {

  private static AppConnections instance = null;

  private List<String> connectedUsers;
  private int currentConnectionNum;

  public static AppConnections getInstance() {
    if (instance == null) {             // wątek A wchodzi o linii 15 i przechodzi do linii 16 (jeszcze nie wykonal)
      instance = new AppConnections(); // tu jest wątek A, instance jest null. // wątek B również wpada do linii nr 16.
    }
    return instance;
  }

  private AppConnections() {
    connectedUsers = new ArrayList<>();
  }

  public List<String> getConnectedUsers() {
    return connectedUsers;
  }

  public int getCurrentConnectionNum() {
    return currentConnectionNum;
  }

  public void connectUser(final String username) {
    currentConnectionNum++;
    if (!connectedUsers.contains(username)) {
      connectedUsers.add(username);
    }
  }
}
