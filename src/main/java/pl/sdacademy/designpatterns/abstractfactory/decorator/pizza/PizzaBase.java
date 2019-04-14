package pl.sdacademy.designpatterns.abstractfactory.decorator.pizza;

import java.util.ArrayList;
import java.util.List;

public class PizzaBase {

  private List<String> ingredients = new ArrayList<>();

  public PizzaBase() {
    ingredients.add("Base");
  }

  public List<String> displayPizzaContent() {
    return ingredients;
  }
}
