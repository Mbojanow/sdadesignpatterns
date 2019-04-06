package pl.sdacademy.designpatterns.abstractfactory.proxy;

public class ProxyDemo {

  public static void main(final String[] args) {
    final ConfigLoader configLoader
        = new ExternalConfigLoaderProxy("http:someserver.com");

    configLoader.load();
    configLoader.load();
    configLoader.load();
  }
}
