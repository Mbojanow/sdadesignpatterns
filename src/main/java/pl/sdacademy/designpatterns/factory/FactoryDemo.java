package pl.sdacademy.designpatterns.factory;

// practice: stworzyć PcGameFactory i tutaj sprawdzić jak działą
public class FactoryDemo {
    public static void main(String[] args) {
        Game boardGame = new BoardGameFactory().createBoardGame("Monopoly", "Albi", 4);
        boardGame.describe();
    }
}
