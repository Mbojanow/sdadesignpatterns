package pl.sdacademy.designpatterns.proxy;

public class ConfigLoaderImpl implements ConfigLoader{
  private String configuration;
  private String serverURL;

  public ConfigLoaderImpl(final String serverURL) {
    this.serverURL = serverURL;
  }

  @Override
  public String load() {
    System.out.println("Getting configutration");
    try {
      Thread.sleep(2000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    configuration = "Configurastion from " + serverURL;

    return configuration;
  }
}
