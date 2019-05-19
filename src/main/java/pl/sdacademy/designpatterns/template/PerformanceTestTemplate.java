package pl.sdacademy.designpatterns.template;

public abstract class PerformanceTestTemplate {

    public abstract int testIterationNum();

    public abstract int warmupIterationNum();

    public abstract void iteration();

    public void run() {
        for (int index = 0; index < warmupIterationNum(); index++) {
            iteration();
        }

        final long start = System.currentTimeMillis();
        for (int index = 0; index < testIterationNum(); index++) {
            iteration();
        }
        final long end = System.currentTimeMillis();
        System.out.println("Avg iteration time " +
                ((double)end - start) / testIterationNum());
    }

}
