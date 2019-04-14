package pl.sdacademy.designpatterns.abstractfactory.decorator.pizza;

import java.util.List;

public class WithCheesePizza extends PizzaBase {

  private PizzaBase pizzaBase;

  public WithCheesePizza(final PizzaBase pizzaBase) {
    this.pizzaBase = pizzaBase;
  }

  @Override
  public List<String> displayPizzaContent() {
    final List<String> ingredients = pizzaBase.displayPizzaContent();
    ingredients.add("Cheese");
    return ingredients;
  }
}
