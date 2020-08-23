package pl.sdacademy.designpatterns.strategy;

import java.security.NoSuchAlgorithmException;

public class StrategyDemo {
  public static void main(String[] args) throws NoSuchAlgorithmException {
    // 1 -> AES
    // 2 -> DES
    // 3 -> SHA

    SecretKeyGenerationStrategy strategy = null;
    String userChoice = args[0];

    switch (userChoice) {
      case "1":
        strategy = new AESSecretKeyGenerator();
        break;
      case "2":
        strategy = new DESSecretKeyGenerator();
        break;
      case "3":
        strategy = new SHASecretKeyGenerator();
        break;
    }

    System.out.println(strategy.generate());
    System.out.println(strategy.generate().getAlgorithm());
  }
}
