package pl.sdacademy.designpatterns.template;

import java.util.Comparator;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListSortingPerformanceTest extends PerformanceTestTemplate {

    @Override
    public int getIterationsNum() {
        return 100;
    }

    @Override
    public int getWarmupIterationsNum() {
        return 2;
    }

    @Override
    public void iteration() {
        Random random = new Random();
        var values = Stream.generate(random::nextInt) // () -> random.nextInt()
                .limit(10000)
                .collect(Collectors.toList());
        values.sort(Comparator.naturalOrder());
    }
}
