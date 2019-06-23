package pl.sdacademy.designpatterns.strategy;

import java.security.NoSuchAlgorithmException;

import javax.crypto.SecretKey;

public class SecretKetGenerator {

  public SecretKey create(final String alg) throws NoSuchAlgorithmException {
    switch (alg) {
      case "aes":
        return new AESSecretKeyGenerationStrategy().generate();
      case "des":
        return new DESSecretKeyGenerationStrategy().generate();
    }
    throw new NoSuchAlgorithmException();
  }
}
