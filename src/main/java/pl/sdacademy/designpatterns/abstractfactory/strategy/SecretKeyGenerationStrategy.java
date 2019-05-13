package pl.sdacademy.designpatterns.abstractfactory.strategy;

import java.security.NoSuchAlgorithmException;

import javax.crypto.SecretKey;

public interface SecretKeyGenerationStrategy {

  SecretKey generate() throws NoSuchAlgorithmException;
}
