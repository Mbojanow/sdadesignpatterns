package pl.sdacademy.designpatterns.abstractfactory.factory.car;

import pl.sdacademy.designpatterns.abstractfactory.factory.AbstractFactory;

public class CarFactory implements AbstractFactory<Car> {

  @Override
  // typ CC - corolla, TA - auris, SF - fabia
  public Car create(final String type) {
    switch(type) {
      case "CC" : return createToyotaCorollaClassic();
      case "TA" : return createToyotaAuris();
      case "SF" : return createSkodaFabia();
    }
    throw new RuntimeException("Car type not found");
  }

  private Car createToyotaCorollaClassic() {
    return new Toyota("Corolla",
        EngineType.GASOLINE_NATURALLY_ASPIRATED,
        1.6D,
        4);
  }

  private Car createToyotaAuris() {
    return new Toyota("Auris",
        EngineType.GASOLINE_TURBO,
        1.2D,
        4);
  }

  private Car createSkodaFabia() {
    return new Skoda("Fabia", EngineType.GASOLINE_TURBO,
        1.0D,
        4);
  }
}
