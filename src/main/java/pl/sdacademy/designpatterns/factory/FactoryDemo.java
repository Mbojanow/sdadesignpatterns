package pl.sdacademy.designpatterns.factory;

import pl.sdacademy.designpatterns.factory.car.Car;
import pl.sdacademy.designpatterns.factory.car.FactoryCategory;

public class FactoryDemo {
  public static void main(String[] args) {
    final FactoryProvider factoryProvider = new FactoryProvider();

    // na enumach -> valueOf -> konwersje string -> wartość enuma
    // zakladamy ze String przychodzi jako argument programu
    final Car createdCar = factoryProvider
        .create(FactoryCategory.valueOf(args[0]))
        .create("TC");

    System.out.println(createdCar.getBodyType());
    System.out.println(createdCar.getCylindersNum());
    System.out.println(createdCar.getModelName());
    System.out.println(createdCar.getEngineVolume());
    System.out.println(createdCar.getType());
  }
}
