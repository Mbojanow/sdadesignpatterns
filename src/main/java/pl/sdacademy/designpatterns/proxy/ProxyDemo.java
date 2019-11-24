package pl.sdacademy.designpatterns.proxy;

public class ProxyDemo {
  public static void main(String[] args) {
    final ConfigLoader readLoader =
        new ExternalConfigLoader("http://localhost:8080");
    final ConfigLoader proxyLoad = new ConfigLoaderProxy(readLoader);
    proxyLoad.load();
    proxyLoad.load();
  }
}
