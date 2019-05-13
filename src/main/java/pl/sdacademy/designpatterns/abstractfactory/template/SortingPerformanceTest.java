package pl.sdacademy.designpatterns.abstractfactory.template;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class SortingPerformanceTest extends PerformanceTestTemplate {

  @Override
  int interationsNum() {
    return 100;
  }

  @Override
  int warmupIterations() {
    return 3;
  }

  @Override
  void iteration() {
    final List<Integer> numbers = new ArrayList<>();
    for (int idx = 0; idx < 10000; idx++) {
      numbers.add(new Random().nextInt());
    }
    numbers.sort(Comparator.naturalOrder());
  }
}
