package pl.sdacademy.designpatterns.abstractfactory.decorator;

public class DecoratorDemo {

  public static void main(final String[] args) {

    //final ICalculator calculator = new CalculatorDecorator();
    final ICalculator calculator = new CalculatorDecorator(new Calculator());
    calculator.subtract(2.5, 3.8);
  }
}
