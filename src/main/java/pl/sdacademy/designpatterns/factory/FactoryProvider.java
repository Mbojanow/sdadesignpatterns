package pl.sdacademy.designpatterns.factory;

import pl.sdacademy.designpatterns.factory.car.Car;
import pl.sdacademy.designpatterns.factory.car.CombiCarFactory;
import pl.sdacademy.designpatterns.factory.car.FactoryCategory;
import pl.sdacademy.designpatterns.factory.car.SedanCarFactory;

public class FactoryProvider {
  public static AbstractFactory<Car> getFactory(final FactoryCategory factoryCategory){
    switch (factoryCategory){
      case SEDANS:
        return new SedanCarFactory();
      case COMBIS:
        return new CombiCarFactory();
    }



    return null;
  }
}
