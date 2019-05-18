package pl.sdacademy.designpatterns.proxy;

public class ProxyDemo {
  public static void main(String[] args) {
    final ConfigLoader configLoader = new ConfigLoaderProxy("http://someserver.com:8080");

    configLoader.load();
    configLoader.load();
    configLoader.load();
  }
}
