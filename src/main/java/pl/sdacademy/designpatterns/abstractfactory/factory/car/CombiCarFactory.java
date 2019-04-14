package pl.sdacademy.designpatterns.abstractfactory.factory.car;

import pl.sdacademy.designpatterns.abstractfactory.factory.AbstractFactory;

public class CombiCarFactory implements AbstractFactory<Car> {

  private Car createToyotaCorolla() {
    return new Toyota("Corolla",
        EngineType.GASOLINE_NATURALLY_ASPIRATED,
        2.0,
        4,
        BodyType.COMBI);
  }

  private Car createAudiA4() {
    return new Audi("A4",
        EngineType.GASOLINE_TURBO,
        2.5,
        4,
        BodyType.COMBI);
  }

  // type - A4, TC
  @Override
  public Car create(final String type) {
    switch(type) {
      case "A4": return createAudiA4();
      case "TC": return createToyotaCorolla();
    }
    throw new RuntimeException("Unknown combi type");
  }
}
