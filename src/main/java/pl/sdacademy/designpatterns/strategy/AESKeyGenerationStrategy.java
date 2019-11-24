package pl.sdacademy.designpatterns.strategy;

import java.security.NoSuchAlgorithmException;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class AESKeyGenerationStrategy implements SecretKeyGenerationStrategy {

  @Override
  public SecretKey generate() throws NoSuchAlgorithmException {
    final KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
    keyGenerator.init(256);
    return keyGenerator.generateKey();
  }
}
