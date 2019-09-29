package pl.sdacademy.designpatterns.strategy;

import java.security.NoSuchAlgorithmException;

public class StrategyDemo {
  public static void main(String[] args) throws NoSuchAlgorithmException {
    final String algorithm = args[0];

    final SecretKeyGenerator secretKeyGenerator = new SecretKeyGenerator();
    final SecretKeyGenerationStrategy strategy = secretKeyGenerator.generate(algorithm);
    System.out.println(strategy.generate().getAlgorithm());
  }
}
