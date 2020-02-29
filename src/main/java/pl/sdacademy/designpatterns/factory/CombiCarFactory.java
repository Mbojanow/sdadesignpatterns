package pl.sdacademy.designpatterns.factory;

import pl.sdacademy.designpatterns.factory.car.Audi;
import pl.sdacademy.designpatterns.factory.car.BodyType;
import pl.sdacademy.designpatterns.factory.car.Car;
import pl.sdacademy.designpatterns.factory.car.EngineType;
import pl.sdacademy.designpatterns.factory.car.Toyota;

public class CombiCarFactory implements AbstractFactory<Car> {
  @Override
  public Car create(final String type) {
    switch (type) {
      case "A4":
        return createAudiA4Combi();
      case "A6":
        return createAudiA6Combi();
      case "TC":
        return createCorollaCombi();
    }
    throw new RuntimeException("Unknown combi type");
  }

  private Car createAudiA4Combi() {
    return new Audi("A4", EngineType.DIESEL, 2.5,
        4, BodyType.COMBI);
  }

  private Car createAudiA6Combi() {
    return new Audi("A6", EngineType.DIESEL, 3.3, 8,
        BodyType.COMBI);
  }

  private Car createCorollaCombi() {
    return new Toyota("Corolla", EngineType.GASOLINE_NATURALLY_ASPIRATED,
        2.0, 4, BodyType.COMBI);
  }

  //A4 -> Audi A4, 2.5, 6c, DIESEL
  // A6 -> Audi A6, 3.3, 8c, DIESEL
  // TC -> Corolla, 2.0, 4c, BENZYNA
}
