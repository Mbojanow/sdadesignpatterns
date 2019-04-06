package pl.sdacademy.designpatterns.abstractfactory.singleton;

public class SingletonDemo {

  public static void main(final String[] args) {
    final Counter counterA = Counter.getInstance();
    final Counter counterB = Counter.getInstance();

//    counterA.addTwo();
//    counterB.addThree();
//    counterA.addOne();
//    counterB.addTwo();

    final AppConnections appConnectionsA = AppConnections.getInstance();
    final AppConnections appConnectionsB = AppConnections.getInstance();

    appConnectionsA.connectUser("Michal");
    appConnectionsB.connectUser("Ala");
    appConnectionsA.connectUser("Andrzej");

    System.out.println(appConnectionsA.getConenctedUsers());

    final EnumSingleton s1 = EnumSingleton.INSTANCE;
    final EnumSingleton s2 = EnumSingleton.INSTANCE;

    s1.add();
    s2.add();
  }
}
