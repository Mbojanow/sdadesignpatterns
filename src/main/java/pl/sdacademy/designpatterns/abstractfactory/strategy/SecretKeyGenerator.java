package pl.sdacademy.designpatterns.abstractfactory.strategy;

import java.security.NoSuchAlgorithmException;

import javax.crypto.SecretKey;

public class SecretKeyGenerator {

  private SecretKeyGenerationStrategy secretKeyGenerationStrategy;

  public SecretKeyGenerator(final SecretKeyGenerationStrategy secretKeyGenerationStrategy) {
    this.secretKeyGenerationStrategy = secretKeyGenerationStrategy;
  }

  public SecretKey create() throws NoSuchAlgorithmException {
    return secretKeyGenerationStrategy.generate();
  }
}
