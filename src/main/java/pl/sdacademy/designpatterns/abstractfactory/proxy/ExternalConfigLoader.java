package pl.sdacademy.designpatterns.abstractfactory.proxy;

class ExternalConfigLoader implements ConfigLoader {

  private String configuration;

  public ExternalConfigLoader(final String serverUrl) throws InterruptedException {
    Thread.sleep(2000L);
    System.out.println("Configuguration from " + serverUrl + " received");
    this.configuration = "Configuration from " + serverUrl;
  }

  @Override
  public String load() {
    return configuration;
  }
}
