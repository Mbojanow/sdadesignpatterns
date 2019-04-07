package pl.sdacademy.designpatterns.abstractfactory.decorator;

public class Calculator implements ICalculator {

  public int add(final int val1, final int val2) {
    return val1 + val2;
  }

  public double subtract(final double val1, final double val2) {
    return val1 - val2;
  }
}
