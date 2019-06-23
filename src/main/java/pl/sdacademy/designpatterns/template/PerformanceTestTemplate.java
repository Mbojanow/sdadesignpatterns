package pl.sdacademy.designpatterns.template;

public abstract class PerformanceTestTemplate {

  public abstract int getWarmupIterationNum();

  public abstract int getIterationsNum();

  public abstract void testIteration();

  public void run() {
    for (int idx = 0; idx < getWarmupIterationNum(); idx++) {
      testIteration();
    }

    final long start = System.currentTimeMillis();
    for (int idx = 0; idx < getIterationsNum(); idx++) {
      testIteration();
    }
    final long end = System.currentTimeMillis();

    System.out.println("Average time of an interation took " + ((double)(end - start)) / getIterationsNum() + " ms");
  }

}
