package pl.sdacademy.designpatterns.abstractfactory.template;

public class TemplateDemo {

  public static void main(final String[] args) {

    PerformanceTestTemplate testTemplate = new ListSortPerformanceTest();
    testTemplate.run();
  }
}
