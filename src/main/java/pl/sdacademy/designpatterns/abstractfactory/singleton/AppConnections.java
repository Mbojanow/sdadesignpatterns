package pl.sdacademy.designpatterns.abstractfactory.singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class AppConnections {

  private static AppConnections instance;

  public static AppConnections getInstance() {
    if (Objects.isNull(instance)) {
      System.out.println("Creating instance");
      instance = new AppConnections();
    }
    return instance;
  }

  private List<String> connectedUsers;
  private int timeout;
  private int currenctConnectionsNum;

  private AppConnections() {
    connectedUsers = new ArrayList<>();
  }

  public void connectUser(final String username) {
    connectedUsers.add(username);
    currenctConnectionsNum += 1;
  }

  public List<String> getConnectedUsers() {
    return connectedUsers;
  }

  public int getTimeout() {
    return timeout;
  }

  public int getCurrenctConnectionsNum() {
    return currenctConnectionsNum;
  }
}
