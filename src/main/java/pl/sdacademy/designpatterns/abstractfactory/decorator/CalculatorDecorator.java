package pl.sdacademy.designpatterns.abstractfactory.decorator;

public class CalculatorDecorator implements ICalculator {

  private Calculator calculator;

  public CalculatorDecorator(final Calculator calculator) {
    this.calculator = calculator;
  }

  @Override
  public int add(final int val1, final int val2) {
    return calculator.add(val1, val2);
  }

  @Override
  public double subtract(final double val1, final double val2) {
    System.out.println("In subtract method");
    final double result = calculator.subtract(val1, val2);
    System.out.println(val1 + " - " + val2 + " = " + result);
    return result;
  }
}
