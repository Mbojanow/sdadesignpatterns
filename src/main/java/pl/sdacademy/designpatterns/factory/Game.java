package pl.sdacademy.designpatterns.factory;

public interface Game {
    String getName();
    String getType();
    String getProducer();
    Requirements getRequirements();
    void describe();
}
