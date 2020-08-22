package pl.sdacademy.designpatterns.factorymethod;

public class MMOPCGameFactory implements PCGameFactory {
  @Override
  public Game createOnlineMMOGame(final String name, final String producent) {
    Requirements requirements = new Requirements(false, Integer.MAX_VALUE, 1, Integer.MAX_VALUE);
    return new PCGame(name, "MMO", producent, requirements);
  }
}
