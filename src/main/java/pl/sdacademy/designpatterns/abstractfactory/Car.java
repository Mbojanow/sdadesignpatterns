package pl.sdacademy.designpatterns.abstractfactory;

public interface Car {
  CarType getType();
  String getModelName();
  Integer getCylindersNum();
  String getProducer();
  Float getEngineVolume();
  Integer getTrunkSize();
}

