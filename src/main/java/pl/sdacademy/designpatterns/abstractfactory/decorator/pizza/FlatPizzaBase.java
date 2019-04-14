package pl.sdacademy.designpatterns.abstractfactory.decorator.pizza;

import java.util.List;

public class FlatPizzaBase extends PizzaBase {
  private PizzaBase pizzaBase;

  public FlatPizzaBase(final PizzaBase pizzaBase) {
    this.pizzaBase = pizzaBase;
  }

  @Override
  public List<String> displayPizzaContent() {
    final List<String> ingredients = pizzaBase.displayPizzaContent();
    if (ingredients.contains("Base")) {
      ingredients.remove("Base");
      ingredients.add("Flat");
    }
    return ingredients;
  }
}
