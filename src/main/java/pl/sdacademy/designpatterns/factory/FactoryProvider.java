package pl.sdacademy.designpatterns.factory;

import pl.sdacademy.designpatterns.factory.car.Car;
import pl.sdacademy.designpatterns.factory.car.FactoryCategory;

public class FactoryProvider {
  public AbstractFactory<Car> create(final FactoryCategory category) {
    switch (category) {
      case COMBIS:
        return new CombiCarFactory();
        //break nie wymagany bo wychodzę z metody
      case SEDANS:
        return new SedanCarFactory();
    }
    //lepiej -> wyjatek wlasnego typu
    throw new RuntimeException("Unknown factory type");
  }
}
