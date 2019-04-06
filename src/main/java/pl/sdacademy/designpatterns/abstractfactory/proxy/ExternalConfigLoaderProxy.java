package pl.sdacademy.designpatterns.abstractfactory.proxy;

public class ExternalConfigLoaderProxy implements ConfigLoader {

  private String serverUrl;
  private String configuration;

  public ExternalConfigLoaderProxy(final String serverUrl) {
    this.serverUrl = serverUrl;
  }

  @Override
  public String load() {
    if (configuration == null) {
      try {
        configuration = new ExternalConfigLoader(serverUrl).load();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }

    return configuration;
  }
}
