package pl.sdacademy.designpatterns.abstractfactory.proxy;

import static java.util.Objects.isNull;

public class ExtensionConfigLoaderProxy implements ConfigLoader {

  private String configuration;
  private String serverUrl;

  public ExtensionConfigLoaderProxy(final String serverUrl) {
    this.serverUrl = serverUrl;
  }

  @Override
  public String load() {
    System.out.println("Getting configuration from " + serverUrl);
    if (isNull(configuration)) {
      configuration = new ExtensionConfigLoader(serverUrl).load();
    }
    return configuration;
  }

  public static void main(final String[] args) {
    final ConfigLoader configLoader
        = new ExtensionConfigLoaderProxy("http://localhost:8080");

    configLoader.load();
    configLoader.load();
    configLoader.load();
    configLoader.load();
  }
}
