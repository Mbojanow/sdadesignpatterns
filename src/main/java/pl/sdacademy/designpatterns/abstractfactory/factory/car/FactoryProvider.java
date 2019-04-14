package pl.sdacademy.designpatterns.abstractfactory.factory.car;

import pl.sdacademy.designpatterns.abstractfactory.factory.AbstractFactory;

public class FactoryProvider {

  public static AbstractFactory<Car> getFactory(final FactoryCategory factoryCategory) {
    switch(factoryCategory) {
      case SEDANS: return new SedanCarFactory();
      case COMBIS: return new CombiCarFactory();
    }
    throw new RuntimeException("Unknown factory type");
  }
}
