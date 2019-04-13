package pl.sdacademy.designpatterns.abstractfactory.factory.car;

public interface Car {
    String getModelName();
    EngineType getType();
    Double getEngineVolume();
    int getCylindersNum();
    BodyType getBodyType();
}
