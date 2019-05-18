package pl.sdacademy.designpatterns.proxy;

public class ConfigLoaderProxy implements ConfigLoader {
  private ConfigLoader configLoader;
  private String configuration;
  private String serverUrl;

  public ConfigLoaderProxy(final String serverUrl) {
    this.serverUrl = serverUrl;
    configLoader = new ConfigLoaderImpl(serverUrl);
  }

  @Override
  public String load() {
    if (configuration == null){
      this.configuration = configLoader.load();
    }
    return configuration;
  }
}
