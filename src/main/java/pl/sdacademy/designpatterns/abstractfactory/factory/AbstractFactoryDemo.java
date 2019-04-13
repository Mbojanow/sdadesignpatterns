package pl.sdacademy.designpatterns.abstractfactory.factory;

import pl.sdacademy.designpatterns.abstractfactory.factory.car.Car;

public class AbstractFactoryDemo {

    public static void main(final String[] args) {

        final Car car = (Car)FactoryProvider.getFactory(FactoryCategory.SEDANS).create("TC");

        System.out.println(car.getModelName());
    }
}
