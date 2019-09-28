package pl.sdacademy.designpatterns.proxy;

public class ProxyDemo {
  public static void main(String[] args) {

    final String serverUrl = "http://localhost:8080";
    final ConfigLoader configLoader = new ExternalServerProxyLoader(serverUrl);
    final ConfigLoader configLoaderProxy = new ConfigLoaderProxy(configLoader);
    configLoaderProxy.load();  // 2s
    configLoaderProxy.load();  // 2s -> 0s
    configLoaderProxy.load();  // 2s -> 0s
    System.out.println("FINISHED");
  }
}
