package pl.sdacademy.designpatterns.abstractfactory.factory.car;

import pl.sdacademy.designpatterns.abstractfactory.factory.AbstractFactory;

public class CombiCarFactory implements AbstractFactory<Car>  {

    private Car createCorollaCombi() {
        return new ToyotaCorolla(EngineType.GASOLINE_NATURALLY_ASPIRATED, 1.6D, 4, BodyType.COMBI);
    }

    private Car createTurboCorollaCombi() {
        return new ToyotaCorolla(EngineType.GASOLINE_TURBO, 1.2, 4, BodyType.COMBI);
    }

    private Car createFordFocusCombi() {
        return new FordFocus(EngineType.GASOLINE_TURBO, 1.5, 4, BodyType.COMBI);
    }

    @Override
    public Car create(final String type) {
        switch (type) {
            case "CC":
                return createCorollaCombi();
            case "TC":
                return createTurboCorollaCombi();
            case "FF":
                return createFordFocusCombi();
            default:
                throw new RuntimeException("Unknown type");
        }
    }
}
