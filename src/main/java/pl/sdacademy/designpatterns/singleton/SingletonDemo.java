package pl.sdacademy.designpatterns.singleton;

public class SingletonDemo {

  public static void main(String[] args) {
    final Counter counterA = Counter.getInstance();
    final Counter counterB = Counter.getInstance();

    counterA.addOne();
    counterB.addTwo();
    counterA.addThree();

    final AppConnections appConnectionsA = AppConnections.getInstance();
    final AppConnections appConnectionsB = AppConnections.getInstance();

    appConnectionsA.connectUser("Michal");
    appConnectionsB.connectUser("Michal");
    appConnectionsA.connectUser("Andrzej");

    System.out.println(appConnectionsA.getCurrentConnectionsNum());
    System.out.println(appConnectionsA.getConnectedUsers().size());

    final SingletonEnum singletonEnum = SingletonEnum.INSTANCE;
  }
}
