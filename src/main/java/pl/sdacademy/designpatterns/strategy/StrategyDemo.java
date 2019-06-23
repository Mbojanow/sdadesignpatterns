package pl.sdacademy.designpatterns.strategy;

import java.security.NoSuchAlgorithmException;

import javax.crypto.SecretKey;

public class StrategyDemo {

  public static void main(String[] args) throws NoSuchAlgorithmException {
    final String alg = args[0];

    final SecretKetGenerator generator = new SecretKetGenerator();
    final SecretKey secretKey = generator.create(alg);

    System.out.println(secretKey.getAlgorithm());

  }
}
