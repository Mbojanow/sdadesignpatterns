package pl.sdacademy.designpatterns.abstractfactory.template;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class ListSortPerformanceTest  extends PerformanceTestTemplate {


  @Override
  public void iteration() {
    final List<Integer> values = new ArrayList<>();
    final Random random = new Random();
    for (int i = 0; i < 10000; i++) {
      values.add(random.nextInt());
    }

    values.sort(Comparator.naturalOrder());
  }

  @Override
  public int getWarmupIterationsNum() {
    return 3;
  }

  @Override
  public int getIterationNum() {
    return 100;
  }
}
