package pl.sdacademy.designpatterns.singleton;

public class SingletonDemo {
  public static void main(String[] args) {

    final Counter counterA = Counter.getInstance();
    // nie da sie -> new Counter();
    final Counter counterB = Counter.getInstance();

//    counterA.addOne();
//    counterB.addThree();
//    counterA.addTwo();
//    counterB.addTwo();

    final AppConnections appConnectionsA = AppConnections.getInstance();
    //new AppConnections(); -> nie da sie, konstruktor jest ukryty
    final AppConnections appConnectionsB = AppConnections.getInstance();
    appConnectionsA.connectUser("Andrzej");
    appConnectionsB.connectUser("Łukasz");
    appConnectionsA.connectUser("Ania");
    System.out.println(appConnectionsA.getCurrentConnectionsNum());
  }
}
