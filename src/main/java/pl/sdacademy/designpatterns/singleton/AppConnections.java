package pl.sdacademy.designpatterns.singleton;

import static java.util.Objects.isNull;

import java.util.ArrayList;
import java.util.List;

public class AppConnections {

  private static AppConnections instance;// = new AppConnections();

  private List<String> connectedUsers;
  private int timeout;
  private int currentConnectionsNum;

  public static AppConnections getInstance() {
    if (isNull(instance)) {
      instance = new AppConnections();
    }
    return instance;
  }

  private AppConnections() {
    connectedUsers = new ArrayList<>();
  }

  public void connectUser(final String user) {
    currentConnectionsNum++;
    if (!connectedUsers.contains(user)) {
      connectedUsers.add(user);
    }
  }

  public List<String> getConnectedUsers() {
    return connectedUsers;
  }

  public int getTimeout() {
    return timeout;
  }

  public int getCurrentConnectionsNum() {
    return currentConnectionsNum;
  }
}
