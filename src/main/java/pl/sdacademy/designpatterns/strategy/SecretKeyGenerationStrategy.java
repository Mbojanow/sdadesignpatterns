package pl.sdacademy.designpatterns.strategy;

import java.security.NoSuchAlgorithmException;

import javax.crypto.SecretKey;

public interface SecretKeyGenerationStrategy {

  SecretKey generate() throws NoSuchAlgorithmException;
}
