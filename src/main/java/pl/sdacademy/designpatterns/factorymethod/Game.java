package pl.sdacademy.designpatterns.factorymethod;

public interface Game {
  String getName();
  String getType();
  String getProducer();
  Requirements getRequirements();
  void describe();
}
