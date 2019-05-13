package pl.sdacademy.designpatterns.abstractfactory.strategy;

import java.security.NoSuchAlgorithmException;

import javax.crypto.SecretKey;

public class StrategyDemo {

  public static void main(String[] args) throws NoSuchAlgorithmException {
    final SecretKeyGenerationStrategy aesStrategy = new AESSecretKeyGenerationStrategy();
    final SecretKeyGenerationStrategy desStrategy = new AESSecretKeyGenerationStrategy();

    final SecretKeyGenerator generator = new SecretKeyGenerator(aesStrategy);
    final SecretKey secretKey = generator.create();
    System.out.println(secretKey.getAlgorithm());
  }
}
