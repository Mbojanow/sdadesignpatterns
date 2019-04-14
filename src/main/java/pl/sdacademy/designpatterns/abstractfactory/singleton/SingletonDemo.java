package pl.sdacademy.designpatterns.abstractfactory.singleton;

public class SingletonDemo {

  public static void main(final String[] args) {
    final Counter counterA = Counter.getInstance();
    final Counter counterB = Counter.getInstance();

    counterA.addTwo();
    counterB.addTwo();
    counterA.addThree();
    counterB.addThree();

    final AppConnections appConnectionsA = AppConnections.getInstance();
    final AppConnections appConnectionsB = AppConnections.getInstance();

    appConnectionsA.connectUser("Michal");
    appConnectionsB.connectUser("Andrzej");

    appConnectionsA.getConnectedUsers().forEach(System.out::println);


    EnumSingleton enumSingletonA = EnumSingleton.INSTANCE;
    EnumSingleton enumSingletonB = EnumSingleton.INSTANCE;
  }
}
