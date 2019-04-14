package pl.sdacademy.designpatterns.abstractfactory.decorator.pizza;

public class PizzaOmnomnom {

  public static void main(final String[] args) {
    final PizzaBase pizzaBase = new WithMushroomPizza(new WithCheesePizza(new ThickPizzaBase(new PizzaBase())));
    pizzaBase.displayPizzaContent().forEach(System.out::println  );
  }
}
