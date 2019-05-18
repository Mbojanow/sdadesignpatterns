package pl.sdacademy.designpatterns.factory.car;

import pl.sdacademy.designpatterns.factory.AbstractFactory;

public class CombiCarFactory implements AbstractFactory<Car> {


  @Override
  public Car create(final String type) {
    switch (type) {
      case "TC":
        return createCorollaCombi();
      case "A4":
        return createAudiCombi();
    }
    throw new RuntimeException("Unknown car type ");


  }
  private Car createCorollaCombi(){
    return new Toyota("Corolla", EngineType.GASOLINE_NATURALLY_ASPIRATED,
        2.0D,4, BodyType.COMBI);
  }
  private Car createAudiCombi(){
    return new Audi ("A4", EngineType.DIESE, 2.5D,
        4, BodyType.COMBI);
  }
}
