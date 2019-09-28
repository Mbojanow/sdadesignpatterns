package pl.sdacademy.designpatterns.proxy;

import java.util.Arrays;
import java.util.Random;
import java.util.UUID;

public class ExternalServerProxyLoader implements ConfigLoader {

  //adres zewnetrznej aplikacji
  private String serverUrl;

  private String configuration;

  public ExternalServerProxyLoader(final String serverUrl) {
    this.serverUrl = serverUrl;
  }

  @Override
  public String load() {
    try {
      Thread.sleep(2000L);
    } catch (InterruptedException e) {
      throw new RuntimeException("Sleep interrupted while loading config", e);
    }
    // easy way configuration = UUID.randomUUID().toString();
    final byte[] randomConfigValue = new byte[16];
    new Random().nextBytes(randomConfigValue);
    configuration = Arrays.toString(randomConfigValue);
    System.out.println(configuration);
    return configuration;
  }
}
