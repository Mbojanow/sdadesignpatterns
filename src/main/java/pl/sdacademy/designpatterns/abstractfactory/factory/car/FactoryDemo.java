package pl.sdacademy.designpatterns.abstractfactory.factory.car;

import pl.sdacademy.designpatterns.abstractfactory.factory.AbstractFactory;

public class FactoryDemo {

  public static void main(final String[] args) {

    final AbstractFactory<Car> carFactory = FactoryProvider.getFactory(FactoryCategory.SEDANS);
    final Car car = carFactory.create("TC");
    System.out.println(car.getModelName() + " " + car.getBodyType());

  }
}
