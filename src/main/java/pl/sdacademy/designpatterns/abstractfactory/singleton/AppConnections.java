package pl.sdacademy.designpatterns.abstractfactory.singleton;

import java.util.ArrayList;
import java.util.List;

public class AppConnections {

  private static AppConnections appConnections;// = new AppConnections();

  public static AppConnections getInstance() {
    if (null == appConnections) {
      appConnections = new AppConnections();
      System.out.println("SINGLETON CREATED");
    }
    return appConnections;
  }

  private List<String> conenctedUsers;
  private int timeout;
  private int currentConnectionsNum;

  private AppConnections() {
    conenctedUsers = new ArrayList<>();
  }

  public List<String> getConenctedUsers() {
    return conenctedUsers;
  }

  public int getTimeout() {
    return timeout;
  }

  public int getCurrentConnectionsNum() {
    return currentConnectionsNum;
  }

  public void connectUser(final String username) {
    currentConnectionsNum += 1;
    conenctedUsers.add(username);
  }
}
