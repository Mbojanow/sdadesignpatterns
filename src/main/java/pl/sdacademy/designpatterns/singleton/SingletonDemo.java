package pl.sdacademy.designpatterns.singleton;

import sun.security.krb5.internal.APOptions;

public class SingletonDemo {

  public static void main(String[] args) {
    final Counter counterA = Counter.getInstance();
    final Counter counterB = Counter.getInstance();

    counterA.addOne();
    counterA.addThree();
    counterB.addTwo();
    counterB.addThree();

    final AppConnections appConnectionsA = AppConnections.getInstance();
    final AppConnections appConnectionsB = AppConnections.getInstance();

    appConnectionsA.connectUser("Andrzej");
    appConnectionsB.connectUser("Michal");

    appConnectionsA.getConnectedUsers().forEach(System.out::println);

    final EnumSingleton enumSingletonA = EnumSingleton.INSTANCE;
    final EnumSingleton enumSingletonB = EnumSingleton.INSTANCE;

  }
}
