package pl.sdacademy.designpatterns.abstractfactory.factory;

import pl.sdacademy.designpatterns.abstractfactory.factory.car.CombiCarFactory;
import pl.sdacademy.designpatterns.abstractfactory.factory.car.SedanCarFactory;

public class FactoryProvider {

    public static AbstractFactory getFactory(final FactoryCategory category) {
        if (category == FactoryCategory.SEDANS) {
            return new SedanCarFactory();
        } else if (category == FactoryCategory.COMBIS) {
            return new CombiCarFactory();
        }
        throw new RuntimeException("No factory implementation for given type");
    }

}
