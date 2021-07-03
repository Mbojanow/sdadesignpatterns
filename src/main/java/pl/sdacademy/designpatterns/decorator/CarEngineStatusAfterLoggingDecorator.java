package pl.sdacademy.designpatterns.decorator;

public class CarEngineStatusAfterLoggingDecorator implements EngineStarter {

    private final EngineStarter engineStarter;

    public CarEngineStatusAfterLoggingDecorator(EngineStarter engineStarter) {
        this.engineStarter = engineStarter;
    }

    @Override
    public void startEngine() {
        engineStarter.startEngine();
        System.out.println("Engine started");
    }

    @Override
    public void stopEngine() {
        engineStarter.stopEngine();
        System.out.println("Engine stopped");
    }
}
