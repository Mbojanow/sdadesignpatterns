package pl.sdacademy.designpatterns.abstractfactory.template;

public abstract class PerformanceTestTemplate {

  abstract int interationsNum();

  abstract int warmupIterations();

  abstract void iteration();

  public void run() {

    for (int iterIndex = 0; iterIndex < warmupIterations(); iterIndex++) {
      iteration();
    }

    final long startTimestamp = System.currentTimeMillis();
    for (int iterIndex = 0; iterIndex < interationsNum(); iterIndex++) {
      iteration();
    }
    final long endTimestamp = System.currentTimeMillis();

    final double result = ((double)endTimestamp - startTimestamp) / interationsNum();
    System.out.println("Avg iteration time: " + result);
  }
}
