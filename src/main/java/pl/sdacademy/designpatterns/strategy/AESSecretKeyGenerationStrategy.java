package pl.sdacademy.designpatterns.strategy;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class AESSecretKeyGenerationStrategy  implements SecretKeyGenerationStrategy {

  @Override
  public SecretKey generate() throws NoSuchAlgorithmException {
    final KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
    keyGenerator.init(new SecureRandom());
    return keyGenerator.generateKey();
  }
}
