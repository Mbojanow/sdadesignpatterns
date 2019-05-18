package pl.sdacademy.designpatterns.singleton;

import java.util.ArrayList;
import java.util.List;

public class AppConnections {

  private static AppConnections appConnections;

  public static AppConnections getInstance() {
    if (appConnections == null) {
      appConnections = new AppConnections();
    }
    return appConnections;
  }

  private List<String> connectedUsers;
  private int currentConnectionsNum;

  private AppConnections() {
    connectedUsers = new ArrayList<>();
  }

  public List<String> getConnectedUsers() {
    return connectedUsers;
  }

  public int getCurrentConnectionsNum() {
    return currentConnectionsNum;
  }

  public void connectUser(final String username) {
    if (!connectedUsers.contains(username)) {
      connectedUsers.add(username);
    }
    currentConnectionsNum++;
  }
}
