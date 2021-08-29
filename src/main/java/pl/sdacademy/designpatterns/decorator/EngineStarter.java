package pl.sdacademy.designpatterns.decorator;

/* bazowy interfejs
 - wszystkie dekoratory muszą implementować ten interfejs
 - dekorowany obiekt musi implementować ten interfejs
*/
public interface EngineStarter {
    void startEngine();
    void stopEngine();
}
