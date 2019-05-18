package pl.sdacademy.designpatterns.factory.car;

import pl.sdacademy.designpatterns.factory.AbstractFactory;
import pl.sdacademy.designpatterns.factory.FactoryProvider;

public class FactoryDemo {
  public static void main(String[] args) {

    final AbstractFactory<Car> factory = FactoryProvider.getFactory(FactoryCategory.COMBIS);
    final Car ourCar = factory.create("TC");
    System.out.println((ourCar.getModelName()));
    System.out.println((ourCar.getBodyType()));
  }
}
