package pl.sdacademy.designpatterns.strategy;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class SHASecretKeyGenerator implements SecretKeyGenerationStrategy {
  @Override
  public SecretKey generate() throws NoSuchAlgorithmException {
    KeyGenerator keyGenerator = KeyGenerator.getInstance("HmacSHA256");
    keyGenerator.init(new SecureRandom());
    return keyGenerator.generateKey();
  }
}
