package pl.sdacademy.designpatterns.strategy;

import java.security.Key;
import java.security.NoSuchAlgorithmException;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class HmacSHAGenerationStrategy implements SecretKeyGenerationStrategy {
  @Override
  public SecretKey generate() throws NoSuchAlgorithmException {
    final KeyGenerator keyGenerator = KeyGenerator.getInstance("HmacSHA256");
    return keyGenerator.generateKey();
  }
}
