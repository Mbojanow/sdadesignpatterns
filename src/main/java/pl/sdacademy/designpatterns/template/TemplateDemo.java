package pl.sdacademy.designpatterns.template;

public class TemplateDemo {
  public static void main(String[] args) {
    final PerformanceTestTemplate testTemplate = new SortingListPerformanceTest();

    testTemplate.run();
  }
}
