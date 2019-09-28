package pl.sdacademy.designpatterns.proxy;

import static java.util.Objects.isNull;

public class ConfigLoaderProxy implements ConfigLoader {

  private ConfigLoader realConfigLoader;
  private String configuration;

  public ConfigLoaderProxy(final ConfigLoader realConfigLoader) {
    this.realConfigLoader = realConfigLoader;
  }

  @Override
  public String load() {
    if (isNull(configuration)) {
      // dla wersji wielowątkowej
      synchronized (ConfigLoaderProxy.class) {
        if (isNull(configuration)) {
          System.out.println("Config loading by proxy");
          configuration = realConfigLoader.load();
        }
      }
    }
    return configuration;
  }
}
