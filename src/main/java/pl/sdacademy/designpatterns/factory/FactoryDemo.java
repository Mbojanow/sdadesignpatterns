package pl.sdacademy.designpatterns.factory;

public class FactoryDemo {
    public static void main(String[] args) {
        // soLid -> L
        GameFactory factory = new MonopolyGameFactory();

        Game monopolyGdynia = factory.create("Gdynia");
        Game monopolyGdansk = factory.create("Gdańsk");
        System.out.println(monopolyGdynia);
        System.out.println(monopolyGdansk);
    }
}
