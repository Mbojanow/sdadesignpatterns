package pl.sdacademy.designpatterns.proxy;

public class ProxyDemo {
  public static void main(String[] args) {
    final ConfigLoader configLoader =
        new ExternalServerConfigLoader("http://localhost:8080");
    final ConfigLoader proxy = new ConfigLoaderProxy(configLoader);
//    configLoader.load();
//    configLoader.load();
    proxy.load();
    proxy.load();
  }
}
