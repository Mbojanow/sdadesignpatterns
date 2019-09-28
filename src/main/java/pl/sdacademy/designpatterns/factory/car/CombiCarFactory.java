package pl.sdacademy.designpatterns.factory.car;

import pl.sdacademy.designpatterns.factory.AbstractFactory;

public class CombiCarFactory implements AbstractFactory<Car> {

  // TCO - corolla, 2.0L, bezn wolnossaca, 4 cylidnry
  // A4 - 2.7L diesil, 4 cylindry
  // A5 - 3.0L, diesel, 6 cylindrow

  @Override
  public Car create(final String type) {
    switch (type) {
      case "TCO":
        return createCorollaCombi();
      case "A4":
        return createA4Combi();
      case "A5":
        return createA5Combi();
//      default:
//        throw new RuntimeException("Unknown sedan type");
    }
    throw new RuntimeException("Unknown combi type");
  }

  private Car createCorollaCombi() {
    return new Toyota("Corolla", EngineType.GASOLINE_NATURALLY_ASPIRATED,
        2.0, 4, BodyType.COMBI);
  }

  private Car createA4Combi() {
    return new Audi("A4", EngineType.DIESEL, 2.7,
        4, BodyType.COMBI);
  }

  private Car createA5Combi() {
    return new Audi("A5", EngineType.DIESEL, 3.0,
        6, BodyType.COMBI);
  }
}
