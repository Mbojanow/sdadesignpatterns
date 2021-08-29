package pl.sdacademy.designpatterns.singleton;

public class SingletonDemo {
    public static void main(String[] args) {
        //Counter counter = new Counter(); - nie da się - konstruktor jest prywatny
        Counter counterA = Counter.getInstance();
        Counter counterB = Counter.getInstance();

        counterA.addOne();
        counterB.addTwo();
        counterA.addThree();
        counterB.addTwo();
        counterA.addOne();

        AppConnections appConnectionsA = AppConnections.getInstance();
        AppConnections appConnectionsB = AppConnections.getInstance();
        appConnectionsA.addUser("Ania");
        appConnectionsB.addUser("Artur");
        appConnectionsA.addUser("Jan");
        appConnectionsB.addUser("Kasia");

        appConnectionsA.getConnectedUsers().forEach(users -> System.out.println(users));

        EnumSingleton instance = EnumSingleton.INSTANCE;
    }
}
