package pl.sdacademy.designpatterns.proxy;

public class ExternalServerConfigLoader implements ConfigLoader {

  private String configuration;
  private String serverUrl;

  public ExternalServerConfigLoader(final String serverUrl) {
    this.serverUrl = serverUrl;
  }

  @Override
  public String load() {
    // zasymulować pobieranie konfiguracji z zewnetrznegoi serwera, która trwa ok 2s
    System.out.println("Obtaining configuration from " + serverUrl);
    try {
      Thread.sleep(2000);
    } catch (InterruptedException e) {
      throw new RuntimeException(e); // konwersja wyjątku typu checked na unchecked
    }
    configuration = "ConfigurationFromExternalServer";
    return configuration;
  }
}
