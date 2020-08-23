package pl.sdacademy.designpatterns.strategy;

import java.security.NoSuchAlgorithmException;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class AESSecretKeyGenerator implements SecretKeyGenerationStrategy {
  @Override
  public SecretKey generate() throws NoSuchAlgorithmException {
    KeyGenerator aesKeyGenerator = KeyGenerator.getInstance("AES");
    return aesKeyGenerator.generateKey();
  }
}
