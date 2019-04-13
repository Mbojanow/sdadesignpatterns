package pl.sdacademy.designpatterns.decorator.logging;

public class CarEngineStatusBeforeLoggingDecorator implements EngineStarter {

    private EngineStarter engineStarter;

    public CarEngineStatusBeforeLoggingDecorator(final EngineStarter engineStarter) {
        this.engineStarter = engineStarter;
    }

    @Override
    public void startEngine() {
        System.out.println("Engine starting");
        engineStarter.startEngine();
    }

    @Override
    public void stopEngine() {
        System.out.println("Engine stopping");
        engineStarter.stopEngine();
    }
}
