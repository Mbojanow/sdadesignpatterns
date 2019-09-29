package pl.sdacademy.designpatterns.strategy;

import javax.crypto.SecretKey;

public class SecretKeyGenerator {

  SecretKeyGenerationStrategy generate(final String algorithm) {
    switch (algorithm) {
      case "AES":
        return new AESSecretKeyGenerationStrategy();
      case "DES":
        return new DESSecretKeyGenerationStrategy();
      case "HmacSHA256":
        return new SHA256SecretKeyGenerationStrategy();
    }
    throw new RuntimeException("Unknown algorithm");
  }
}
