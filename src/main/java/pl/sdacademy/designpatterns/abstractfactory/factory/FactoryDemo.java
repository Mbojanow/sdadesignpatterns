package pl.sdacademy.designpatterns.abstractfactory.factory;

import pl.sdacademy.designpatterns.abstractfactory.factory.car.Car;

public class FactoryDemo {

  public static void main(final String[] args) {
    // create Toyota Corolla
    AbstractFactory factory = new FactoryProvider().getFactory(FactoryType.CAR);
    final Car car = (Car)factory.create("CC");
    System.out.println(car.getModelName());
  }
}
