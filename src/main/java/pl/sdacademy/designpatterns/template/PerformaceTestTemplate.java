package pl.sdacademy.designpatterns.template;

import java.util.ArrayList;
import java.util.List;

import pl.sdacademy.designpatterns.adapter.SystemBUser;

public abstract class PerformaceTestTemplate {

  protected abstract int getWarmupIterationNum();

  protected abstract int getIterationNum();

  protected abstract void iteration();

  public void run() {
    for (int idx = 0; idx < getWarmupIterationNum(); idx++) {
      iteration();
    }

    final List<Long> iterationsExecutionTimes = new ArrayList<>();
    for (int idx = 0; idx < getIterationNum(); idx++) {
      final long start = System.currentTimeMillis();
      iteration();
      final long end = System.currentTimeMillis();
      iterationsExecutionTimes.add(end - start);
    }

    final double avg = iterationsExecutionTimes.stream()
        .mapToDouble(x -> x).sum() / getIterationNum();

    System.out.println("Avg time per iteration: " + avg);
  }
}
