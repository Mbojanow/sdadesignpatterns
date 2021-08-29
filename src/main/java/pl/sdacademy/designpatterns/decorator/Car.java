package pl.sdacademy.designpatterns.decorator;

// bazowy obiekt - dekorowany - też implementuje interfejs
public class Car implements EngineStarter {

    private boolean isStarted = false;

    @Override
    public void startEngine() {
        isStarted = true;
    }

    @Override
    public void stopEngine() {
        isStarted = false;
    }
}
