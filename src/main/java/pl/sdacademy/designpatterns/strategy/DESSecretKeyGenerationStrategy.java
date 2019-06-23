package pl.sdacademy.designpatterns.strategy;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class DESSecretKeyGenerationStrategy implements SecretKeyGenerationStrategy {
  @Override
  public SecretKey generate() throws NoSuchAlgorithmException {
    final KeyGenerator keyGenerator = KeyGenerator.getInstance("DES");
    keyGenerator.init(new SecureRandom());
    return keyGenerator.generateKey();
  }
}
