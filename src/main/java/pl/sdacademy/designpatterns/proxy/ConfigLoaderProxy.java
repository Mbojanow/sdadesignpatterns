package pl.sdacademy.designpatterns.proxy;

public class ConfigLoaderProxy implements ConfigLoader {

  // nie ExternalServiceConfigLoader -> wykorzystustujemy abstrakcje o ile to możliwe
  private final ConfigLoader configLoader;
  private String configuration;

  public ConfigLoaderProxy(final ConfigLoader configLoader) {
    this.configLoader = configLoader;
  }

  @Override
  public String load() {
    if (configuration == null) {
      configuration = configLoader.load(); // wykorzystanie PROXOWANEGO obiektu - "tego prawdziwego"
    }
    return configuration;
  }
}
