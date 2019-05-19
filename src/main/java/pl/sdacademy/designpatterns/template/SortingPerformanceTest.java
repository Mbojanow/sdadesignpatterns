package pl.sdacademy.designpatterns.template;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class SortingPerformanceTest extends PerformanceTestTemplate {
    @Override
    public int testIterationNum() {
        return 100;
    }

    @Override
    public int warmupIterationNum() {
        return 1;
    }

    @Override
    public void iteration() {
        final List<Integer> values = new ArrayList<>();
        final Random random = new Random();
        for (int index = 0; index < 10000; index++) {
            values.add(random.nextInt());
        }

        values.sort(Comparator.naturalOrder());
    }
}
