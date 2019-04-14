package pl.sdacademy.designpatterns.abstractfactory.decorator.pizza;

import java.util.List;

public class ThickPizzaBase extends PizzaBase {

  private PizzaBase pizzaBase;

  public ThickPizzaBase(final PizzaBase pizzaBase) {
    this.pizzaBase = pizzaBase;
  }

  @Override
  public List<String> displayPizzaContent() {
    final List<String> ingredients = pizzaBase.displayPizzaContent();
    if (ingredients.contains("Base")) {
      ingredients.remove("Base");
      ingredients.add("Thick");
    }
    return ingredients;
  }
}
