package pl.sdacademy.designpatterns.singleton;

public class SingletonDemo {
  public static void main(String[] args) {
    Counter counterA = Counter.getInstance(); //new Counter();
    Counter counterB = Counter.getInstance();

    counterA.addOne();
    counterA.addTwo();
    counterB.addThree();
    counterB.addOne();

    //Object obja = new Object();
    //Object objb = obja;

    AppConnections appConnectionsA = AppConnections.getInstance();
    AppConnections appConnectionsB = AppConnections.getInstance();

    appConnectionsA.connectUser("Michal");
    appConnectionsB.connectUser("Andrzej");
    appConnectionsA.connectUser("Adam");
    appConnectionsB.connectUser("Adam");

    System.out.println(appConnectionsA.getCurrentConnectionNum());
    System.out.println(appConnectionsB.getCurrentConnectionNum());

    EnumSingleton instanceA = EnumSingleton.INSTANCE; // getInstance()
    EnumSingleton instanceB = EnumSingleton.INSTANCE; // getInstance()
  }
}
