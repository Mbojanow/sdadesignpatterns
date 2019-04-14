package pl.sdacademy.designpatterns.abstractfactory.decorator.pizza;

import java.util.List;

public class WithMushroomPizza extends PizzaBase {

  private PizzaBase pizzaBase;

  public WithMushroomPizza(final PizzaBase pizzaBase) {
    this.pizzaBase = pizzaBase;
  }

  @Override
  public List<String> displayPizzaContent() {
    final List<String> ingredients = pizzaBase.displayPizzaContent();
    ingredients.add("Mushroom");
    return ingredients;
  }
}
