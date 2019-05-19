package pl.sdacademy.designpatterns.strategy;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class AESSecretKeyGenerationStrategy implements SecretKeyGenerationStrategy {
    @Override
    public SecretKey generate() throws NoSuchAlgorithmException {
        final KeyGenerator generator = KeyGenerator.getInstance("AES");
        generator.init(new SecureRandom());
        return generator.generateKey();
    }
}
