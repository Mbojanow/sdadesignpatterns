package pl.sdacademy.designpatterns.proxy;

public class ProxyDemo {
  public static void main(String[] args) {
    ConfigLoader configLoader = new ExternalServerConfigLoader("http://localhost:8080");
    ConfigLoader proxy = new ConfigLoaderProxy(configLoader); // proxujemy "prawdziwny" obiekt
    proxy.load();
    proxy.load();
    proxy.load();
  }
}
