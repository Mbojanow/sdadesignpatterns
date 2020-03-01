package pl.sdacademy.designpatterns.template;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortingPerformanceTest extends PerformaceTestTemplate {
  @Override
  protected int getWarmupIterationNum() {
    return 2;
  }

  @Override
  protected int getIterationNum() {
    return 100;
  }

  @Override
  protected void iteration() {
    final List<Long> longs = Stream.generate(() -> new Random().nextLong())
        .limit(10000).collect(Collectors.toList());
    final List<Long> sortedValues = longs.stream()
        .sorted()
        .collect(Collectors.toList());
    //System.out.println(sortedValues.size());
  }
}
