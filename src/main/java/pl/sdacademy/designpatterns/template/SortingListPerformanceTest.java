package pl.sdacademy.designpatterns.template;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class SortingListPerformanceTest extends PerformanceTestTemplate {

  @Override
  public void testIteration() {
    final List<Integer> ints = new ArrayList<>();
    final Random random = new Random();
    for (int idx = 0; idx < 10000; idx++) {
      ints.add(random.nextInt());
    }
    ints.sort(Comparator.naturalOrder());
  }

  @Override
  public int getWarmupIterationsNum() {
    return 1;
  }

  @Override
  public int getIterationsNum() {
    return 5;
  }
}
