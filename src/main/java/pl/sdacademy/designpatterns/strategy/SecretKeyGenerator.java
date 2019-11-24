package pl.sdacademy.designpatterns.strategy;

import java.security.NoSuchAlgorithmException;

import javax.crypto.SecretKey;

public class SecretKeyGenerator {

  public SecretKey generateKey(final String type) throws NoSuchAlgorithmException {
    SecretKeyGenerationStrategy strategy;
    switch (type) {
      case "A":
        strategy = new AESKeyGenerationStrategy();
        break;
      case "D":
        strategy = new DESKeyGenerationStrategy();
        break;
      case "H":
        strategy = new HmacSHAGenerationStrategy();
        break;
      default:
        throw new RuntimeException();
    }
    return strategy.generate();

  }
}
