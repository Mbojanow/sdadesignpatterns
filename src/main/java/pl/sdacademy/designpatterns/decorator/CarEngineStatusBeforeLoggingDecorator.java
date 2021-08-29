package pl.sdacademy.designpatterns.decorator;

public class CarEngineStatusBeforeLoggingDecorator implements EngineStarter {

    private final EngineStarter engineStarter;

    public CarEngineStatusBeforeLoggingDecorator(EngineStarter engineStarter) {
        this.engineStarter = engineStarter;
    }

    @Override
    public void startEngine() {
        System.out.println("Engine is about to start");
        engineStarter.startEngine(); // ważne! - dodajemy funkcjonalność więc ZAWSZE wywołujemy bazowe zachowanie
    }

    @Override
    public void stopEngine() {
        System.out.println("Engine is about to stop");
        engineStarter.stopEngine(); // ważne! - dodajemy funkcjonalność więc ZAWSZE wywołujemy bazowe zachowanie
    }
}
