package pl.sdacademy.designpatterns.strategy;

import java.security.NoSuchAlgorithmException;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class SHA256SecretKeyGenerationStrategy implements SecretKeyGenerationStrategy {
  @Override
  public SecretKey generate() throws NoSuchAlgorithmException {
    final KeyGenerator keyGenerator = KeyGenerator.getInstance("HmacSHA256");
    return keyGenerator.generateKey();
  }
}
