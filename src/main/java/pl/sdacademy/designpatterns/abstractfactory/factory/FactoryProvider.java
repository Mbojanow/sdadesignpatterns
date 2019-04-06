package pl.sdacademy.designpatterns.abstractfactory.factory;

import pl.sdacademy.designpatterns.abstractfactory.factory.car.CarFactory;
import pl.sdacademy.designpatterns.abstractfactory.factory.pizza.PizzaFactory;

public class FactoryProvider {

  AbstractFactory getFactory(final FactoryType factoryType) {
    switch (factoryType){
      case CAR: return new CarFactory();
      case PIZZA: return new PizzaFactory();
    }
    throw new RuntimeException("Factory type unknown");
  }
}
