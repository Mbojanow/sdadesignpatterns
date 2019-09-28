package pl.sdacademy.designpatterns.factory.car;

import pl.sdacademy.designpatterns.factory.AbstractFactory;

public class SedanCarFactory implements AbstractFactory<Car> {

  // TCO - toyota corolla
  // TCA - toyota camry // wolnossacy 2.5 silnik, 4cyl
  // A4 - audi a4 // 2.0 diesla 4cyl
  // A5 - audi a5 // 2.0 benzyne turbo, 6 cylindrow

  @Override
  public Car create(final String type) {
    switch (type) {
      case "TCO":
        return createCorollaSedan();
      // break -> niepotrzebne bo wychodzimy z metody
      case "TCA":
        return createCamrySedan();
      case "A4":
        return createA4Sedan();
      case "A5":
        return createA5Sedan();
//      default:
//        throw new RuntimeException("Unknown sedan type");
    }
    throw new RuntimeException("Unknown sedan type");
  }

  // factory method design pattern
  // Możemy zwrócic Car bo Toyota implementuje interfejs Car!
  private Car /* NIE Toyota */ createCorollaSedan() {
    return new Toyota("Corolla", EngineType.GASOLINE_NATURALLY_ASPIRATED,
        1.8, 4, BodyType.SEDAN);
  }

  private Car createCamrySedan() {
    return new Toyota("Camry", EngineType.GASOLINE_NATURALLY_ASPIRATED, 2.5,
        4, BodyType.SEDAN);
  }

  private Car createA4Sedan() {
    return new Audi("A4", EngineType.DIESEL, 2.0,
        4, BodyType.SEDAN);
  }

  private Car createA5Sedan() {
    return new Audi("A5", EngineType.GASOLINE_TURBO, 2.0,
        6, BodyType.SEDAN);
  }
}
