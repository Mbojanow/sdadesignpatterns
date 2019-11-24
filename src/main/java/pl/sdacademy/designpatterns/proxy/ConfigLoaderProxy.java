package pl.sdacademy.designpatterns.proxy;

import static java.util.Objects.isNull;

public class ConfigLoaderProxy implements ConfigLoader {

  private ConfigLoader configLoader;
  private String configuration;

  public ConfigLoaderProxy(final ConfigLoader configLoader) {
    this.configLoader = configLoader;
  }

  @Override
  public String load() {
    if (isNull(configuration)) {
      configuration = configLoader.load();
    }
    return configuration;
  }
}
