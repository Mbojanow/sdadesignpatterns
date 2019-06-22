package pl.sdacademy.designpatterns.singleton;

import java.util.ArrayList;
import java.util.List;

public class AppConnections {

  private List<String> connectedUsers;
  private int currentConnectionsNum = 0;
  private long timeout;

  private static AppConnections appConnections;

  public static AppConnections getInstance() {
    if (appConnections == null) {
      appConnections = new AppConnections();
      System.out.println("Initialized AppConnections");
    }
    return appConnections;
  }

  private AppConnections() {
    connectedUsers = new ArrayList<>();
  }

  public void connectUser(final String username) {
    connectedUsers.add(username);
  }

  public List<String> getConnectedUsers() {
    return connectedUsers;
  }

  public int getCurrentConnectionsNum() {
    return currentConnectionsNum;
  }

  public long getTimeout() {
    return timeout;
  }

  public static AppConnections getAppConnections() {
    return appConnections;
  }
}
