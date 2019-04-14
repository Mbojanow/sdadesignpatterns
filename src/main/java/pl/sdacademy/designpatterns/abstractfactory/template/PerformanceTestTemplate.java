package pl.sdacademy.designpatterns.abstractfactory.template;

import pl.sdacademy.designpatterns.abstractfactory.adapter.systemb.SystemBUser;

public abstract class PerformanceTestTemplate {

  public abstract void iteration();

  public abstract int getWarmupIterationsNum();

  public abstract int getIterationNum();

  public void run() {
    for (int i = 0; i < getWarmupIterationsNum(); i++) {
      iteration();
    }

    final long start = System.currentTimeMillis();
    for (int i = 0; i < getIterationNum(); i++) {
      iteration();
    }
    final long end = System.currentTimeMillis();
    System.out.println((end - start) / getIterationNum());
  }

}
