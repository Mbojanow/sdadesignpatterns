package pl.sdacademy.designpatterns.singleton;

public class AppConnectionsDemo {
  public static void main(String[] args) {
    final AppConnections appConnectionsA = AppConnections.getInstance(); // NIE DA SIE -> new AppConnectuions();
    final AppConnections appConnectionsB = AppConnections.getInstance();

    appConnectionsA.connectUser("Michal");
    appConnectionsB.connectUser("Andrzej");
    appConnectionsA.connectUser("Ola");
    appConnectionsB.connectUser("Michal");
    System.out.println(appConnectionsA.getCurrentConnectionsNum());

  }
}
