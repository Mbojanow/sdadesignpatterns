package pl.sdacademy.designpatterns.template;

public abstract class PerformanceTestTemplate {

  public abstract void testIteration();
  public abstract int getWarmupIterationsNum();
  public abstract int getIterationsNum();

  public void run() {
    for (int idx = 0; idx < getWarmupIterationsNum(); idx++) {
      testIteration();
    }

    final long start = System.currentTimeMillis();
    for (int idx = 0; idx < getIterationsNum(); idx++) {
      testIteration();
    }
    final long end = System.currentTimeMillis();

    System.out.println((end - start) / (double)getIterationsNum());
  }
}
