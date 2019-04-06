package pl.sdacademy.designpatterns.abstractfactory.factory.pizza;

import pl.sdacademy.designpatterns.abstractfactory.factory.AbstractFactory;

public class PizzaFactory implements AbstractFactory<Pizza> {
  @Override
  // SF, BF
  public Pizza create(final String type) {
    switch(type) {
      case "SF": return createSmallFunghi();
      case "BF": createBigFunghi();
    }
    throw new RuntimeException("Pizza type unknown");
  }

  public Pizza createSmallFunghi() {
    return new FunghiPizza(Base.FLAT, 20D);
  }

  public Pizza createBigFunghi() {
    return new FunghiPizza(Base.THICK, 40D);
  }
}
