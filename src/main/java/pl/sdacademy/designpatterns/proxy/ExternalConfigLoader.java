package pl.sdacademy.designpatterns.proxy;

import java.util.Random;

public class ExternalConfigLoader implements ConfigLoader {

  //http://localhost:8080
  //ldap://someserver:9031
  private String serverUrl;
  private String configuration;

  public ExternalConfigLoader(final String serverUrl) {
    this.serverUrl = serverUrl;
  }

  @Override
  public String load() {
    System.out.println("Fetching config from " + serverUrl);
    try {
      Thread.sleep(2000L);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    final byte[] data = new byte[16];
    new Random().nextBytes(data);
    configuration = new String(data);
    return configuration;
  }

  public String getConfiguration() {
    return configuration;
  }
}
