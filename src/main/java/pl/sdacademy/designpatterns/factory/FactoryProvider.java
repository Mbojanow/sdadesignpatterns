package pl.sdacademy.designpatterns.factory;

import pl.sdacademy.designpatterns.factory.car.Car;
import pl.sdacademy.designpatterns.factory.car.CombiCarFactory;
import pl.sdacademy.designpatterns.factory.car.FactoryCategory;
import pl.sdacademy.designpatterns.factory.car.SedanCarFactory;

public class FactoryProvider {
  public AbstractFactory<Car> getFactory(final FactoryCategory category) {
    //SEDANS -> SedanCarFacotry
    //COMBIS -> CombiCarFactory

    switch (category) {
      case SEDANS:
        return new SedanCarFactory();
      case COMBIS:
        return new CombiCarFactory();
    }
    throw new RuntimeException("Unknown factory category type");

  }
}
