package pl.sdacademy.designpatterns.decorator;

// interfejs bazowy
// wszystkie implementacje jak i dekorowant obiekt MUSZĄ! implementować ten interfejs
public interface EngineStarter {

  void startEngine();
  void stopEngine();
}
