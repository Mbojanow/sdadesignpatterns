package pl.sdacademy.designpatterns.strategy;

import java.security.NoSuchAlgorithmException;

import javax.crypto.SecretKey;

public class StrategyDemo {

  public static void main(String[] args) throws NoSuchAlgorithmException {
    final SecretKeyGenerator generator = new SecretKeyGenerator();
    final SecretKey secretKey = generator.generateKey(args[0]);
    System.out.println(secretKey.getAlgorithm());
    System.out.println(new String(secretKey.getEncoded()));
  }

}
