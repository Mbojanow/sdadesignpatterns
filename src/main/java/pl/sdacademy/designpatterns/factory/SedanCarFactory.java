package pl.sdacademy.designpatterns.factory;

import pl.sdacademy.designpatterns.factory.car.Audi;
import pl.sdacademy.designpatterns.factory.car.BodyType;
import pl.sdacademy.designpatterns.factory.car.Car;
import pl.sdacademy.designpatterns.factory.car.EngineType;
import pl.sdacademy.designpatterns.factory.car.Toyota;

public class SedanCarFactory implements AbstractFactory<Car> {

  // A4 -> audi A4, diesel, 1.9 DIESEL, 4c
  // A6 -> audi A6, diseel 2.7, 6c
  // TC -> toyota corolla, 1.8 beznyna, 4c

  @Override
  public Car create(final String type) {
    switch (type) {
      case "A4":
        return createAudiA4Sedan();
      case "A6":
        return createAudiA6Sedan();
      case "TC":
        return createToyotaCorollaSedan();
    }
    throw new RuntimeException("Unknown sedan type");
  }

  private Car createAudiA4Sedan() {
    return new Audi("A4", EngineType.DIESEL,
        1.9, 4, BodyType.SEDAN);
  }

  private Car createAudiA6Sedan() {
    return new Audi("A6", EngineType.DIESEL,
        2.7, 6, BodyType.SEDAN);
  }

  private Car createToyotaCorollaSedan() {
    return new Toyota("Corolla", EngineType.GASOLINE_NATURALLY_ASPIRATED,
        1.8, 4, BodyType.SEDAN);
  }

}
