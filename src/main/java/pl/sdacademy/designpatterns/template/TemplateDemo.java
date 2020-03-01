package pl.sdacademy.designpatterns.template;

public class TemplateDemo {
  public static void main(String[] args) {
    final PerformaceTestTemplate test = new SortingPerformanceTest();
    test.run();
  }
}
