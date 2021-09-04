package pl.sdacademy.designpatterns.template;

public abstract class PerformanceTestTemplate {

    public abstract int getIterationsNum();
    public abstract int getWarmupIterationsNum();
    public abstract void iteration();

    // szkielet algorytmu
    public final void run() {

        for (int i = 0; i < getWarmupIterationsNum(); i++) {
            iteration();
        }

        long startTimestamp = System.currentTimeMillis();
        for (int i = 0; i < getIterationsNum(); i++) {
            iteration();
        }
        long endTimestamp = System.currentTimeMillis();
        double averageIterationTime = (endTimestamp - startTimestamp) / (double)getIterationsNum();
        System.out.println("Average execution time: " + averageIterationTime + " ms");
    }
}
