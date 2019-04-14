package pl.sdacademy.designpatterns.abstractfactory.proxy;

public class ExtensionConfigLoader implements ConfigLoader {

  private String serverUrl;
  private String configuration;

  public ExtensionConfigLoader(final String serverUrl) {
    this.serverUrl = serverUrl;
  }

  @Override
  public String load() {
    try {
      Thread.sleep(2000L);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    configuration = "Configuration loaded from " + serverUrl;
    return configuration;
  }
}
