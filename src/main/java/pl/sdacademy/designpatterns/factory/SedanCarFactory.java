package pl.sdacademy.designpatterns.factory;

import pl.sdacademy.designpatterns.factory.car.Audi;
import pl.sdacademy.designpatterns.factory.car.BodyType;
import pl.sdacademy.designpatterns.factory.car.Car;
import pl.sdacademy.designpatterns.factory.car.EngineType;
import pl.sdacademy.designpatterns.factory.car.Toyota;

public class SedanCarFactory implements AbstractFactory<Car> {

  //TC - Toyota corolla sedan - 1.6, 4cyl, wolnossacy benzzyna
  //A4 - Audi a4 sedan - 1.8, 4cyl, benzyna turbo
  @Override
  public Car create(final String type) {
    switch (type) {
      case "TC":
        return createToyotaCorollaSedan();
      case "A4":
        return createAudiA4Sedan();
    }
    // idealnie - wyjatek wlasnego typu
    throw new RuntimeException("Unknown sedan type");
  }

  private Car createToyotaCorollaSedan() {
    // w domu -> zamiast konstruktora uzyc builder pattern
    return new Toyota("Corolla", EngineType.GASOLINE_NATURALLY_ASPIRATED,
        1.6D, 4, BodyType.SEDAN);
  }

  private Car createAudiA4Sedan() {
    return new Audi("A4", EngineType.GASOLINE_TURBO, 1.8D,
        4, BodyType.SEDAN);
  }
}
