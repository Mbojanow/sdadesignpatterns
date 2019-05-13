package pl.sdacademy.designpatterns.abstractfactory.strategy;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class HmacSHA256SecretKeyGenerationStrategy implements SecretKeyGenerationStrategy {
  @Override
  public SecretKey generate() throws NoSuchAlgorithmException {
    final KeyGenerator generator = KeyGenerator.getInstance("HmacSHA256");
    generator.init(new SecureRandom());
    return generator.generateKey();
  }
}
