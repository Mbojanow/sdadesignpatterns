package pl.sdacademy.designpatterns.factory;

import pl.sdacademy.designpatterns.factory.car.Car;
import pl.sdacademy.designpatterns.factory.car.FactoryCategory;

public class FactoryDemo {
  public static void main(String[] args) {

    final FactoryProvider factoryProvider = new FactoryProvider();
    final AbstractFactory<Car> factory = factoryProvider.getFactory(FactoryCategory.SEDANS);
    final Car car = factory.create("TCO");

    System.out.println(car.getModelName());
    System.out.println(car.getBodyType());
    System.out.println(car.getCylindersNum());
    System.out.println(car.getType());
    System.out.println(car.getEngineVolume());

  }
}
