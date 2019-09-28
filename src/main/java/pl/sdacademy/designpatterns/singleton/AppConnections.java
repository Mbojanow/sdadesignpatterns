package pl.sdacademy.designpatterns.singleton;

import java.util.ArrayList;
import java.util.List;

// singleton type LAZY
public class AppConnections {

  // kolejnosc
  // pola statyczne
  // pola prywatne
  // metody statyczne
  // konstruktory
  // ? różnie -> metody publicze, metody prywatne

  private static AppConnections instance;

  private List<String> connectedUsers;
  private int currentConnectionsNum;

  // inicjalizacja typu LAZY
  public static AppConnections getInstance() {
    if (instance == null) {
      instance = new AppConnections();
    }
    return instance;
  }

  // chowamy mozliwosc stworzenia obiektu za pomocą new
  private AppConnections() {
    connectedUsers = new ArrayList<>();
  }

  public void connectUser(final String username) {
    currentConnectionsNum++;
    if (!connectedUsers.contains(username)) {
      connectedUsers.add(username);
    }
  }

  public List<String> getConnectedUsers() {
    return connectedUsers;
  }

  public int getCurrentConnectionsNum() {
    return currentConnectionsNum;
  }
}
