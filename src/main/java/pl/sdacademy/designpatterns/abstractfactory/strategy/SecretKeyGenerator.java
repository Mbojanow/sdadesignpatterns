package pl.sdacademy.designpatterns.abstractfactory.strategy;

import java.security.NoSuchAlgorithmException;

import javax.crypto.SecretKey;

public class SecretKeyGenerator {

  private SecretKeyGenerationStrategy strategy;

  public SecretKeyGenerator(final SecretKeyGenerationStrategy strategy) {
    this.strategy = strategy;
  }

  public SecretKeyGenerationStrategy getStrategy() {
    return strategy;
  }

  public void setStrategy(final SecretKeyGenerationStrategy strategy) {
    this.strategy = strategy;
  }

  public SecretKey create() throws NoSuchAlgorithmException {
    return strategy.generate();
  }
}
