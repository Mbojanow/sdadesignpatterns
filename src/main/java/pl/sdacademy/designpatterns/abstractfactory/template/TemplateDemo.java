package pl.sdacademy.designpatterns.abstractfactory.template;

public class TemplateDemo {

  public static void main(String[] args) {

    final PerformanceTestTemplate test = new SortingPerformanceTest();

    test.run();
  }
}
