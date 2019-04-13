package pl.sdacademy.designpatterns.abstractfactory.factory.car;

import pl.sdacademy.designpatterns.abstractfactory.factory.AbstractFactory;

public class SedanCarFactory implements AbstractFactory<Car> {

    private Car createCorollaClassic() {
        return new ToyotaCorolla(EngineType.GASOLINE_NATURALLY_ASPIRATED, 1.6D, 4, BodyType.SEDAN);
    }

    private Car createTubroCorolla() {
        return new ToyotaCorolla(EngineType.GASOLINE_TURBO, 1.2, 4, BodyType.SEDAN);
    }

    private Car createFordFocus() {
        return new FordFocus(EngineType.GASOLINE_TURBO, 1.5, 4, BodyType.SEDAN);
    }

    @Override
    public Car create(final String type) {
        switch (type) {
            case "CC":
                return createCorollaClassic();
            case "TC":
                return createTubroCorolla();
            case "FF":
                return createFordFocus();
            default:
                throw new RuntimeException("Unknown type");
        }
    }
}
