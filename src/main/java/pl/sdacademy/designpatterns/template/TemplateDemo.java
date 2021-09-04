package pl.sdacademy.designpatterns.template;

public class TemplateDemo {
    public static void main(String[] args) {
        //ListSortingPerformanceTest test = new ListSortingPerformanceTest(); NIE WYKORZYSTANIE LISKOV
        PerformanceTestTemplate test = new ListSortingPerformanceTest();
        test.run();
    }
}
