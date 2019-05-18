package pl.sdacademy.designpatterns.factory.car;

import pl.sdacademy.designpatterns.factory.AbstractFactory;

public class SedanCarFactory implements AbstractFactory<Car> {


  @Override
  public Car create(final String type) {
    switch (type){
      case "TC":
        return creatCorollaSedan();
        case "A4":
        return createAudiA4();

    }
    throw new RuntimeException("Unknown car type");

  }
  private  Car creatCorollaSedan(){
    return new Toyota("Corolla", EngineType.GASOLINE_NATURALLY_ASPIRATED,
        1.6D,
        4, BodyType.SEDAN);
  }
  private Car createAudiA4() {
    return new Audi("A4", EngineType.DIESE,
        2.0D, 4, BodyType.SEDAN);
  }

}
