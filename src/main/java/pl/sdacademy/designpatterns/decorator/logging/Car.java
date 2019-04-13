package pl.sdacademy.designpatterns.decorator.logging;

public class Car implements EngineStarter {

    private boolean engineStarted = false;

    public Car() {
        System.out.println("Creating a car");
    }

    public void startEngine() {
        engineStarted = true;
    }

    public void stopEngine() {
        engineStarted = false;
    }
}
