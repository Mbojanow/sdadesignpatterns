package pl.sdacademy.designpatterns.factory;

import pl.sdacademy.designpatterns.factory.car.Audi;
import pl.sdacademy.designpatterns.factory.car.BodyType;
import pl.sdacademy.designpatterns.factory.car.Car;
import pl.sdacademy.designpatterns.factory.car.EngineType;
import pl.sdacademy.designpatterns.factory.car.Toyota;

public class CombiCarFactory implements AbstractFactory<Car> {

  //TC -> Corolla Kombi, 2.0, wolnossal, 4 cyl
  //A4 -> Audi A4 Kombi, 2.7, diesel, 6 cyl
  @Override
  public Car create(final String type) {
    switch (type) {
      case "TC":
        return createToyotaCorollaCombi();
      case "A4":
        return createAudiA4Combi();
    }
    // idealnie - wyjatek wlasnego typu
    throw new RuntimeException("Unknown combi type");
  }

  private Car createToyotaCorollaCombi() {
    // w domu - wykorzystac tutaj builder pattern
    return new Toyota("Corolla", EngineType.GASOLINE_NATURALLY_ASPIRATED,
        2.0D, 4, BodyType.COMBI);
  }

  private Car createAudiA4Combi() {
    return new Audi("A4", EngineType.DIESEL, 2.7, 6,
        BodyType.COMBI);
  }

}
