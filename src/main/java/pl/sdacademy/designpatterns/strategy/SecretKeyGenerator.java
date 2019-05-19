package pl.sdacademy.designpatterns.strategy;

import javax.crypto.SecretKey;
import java.security.NoSuchAlgorithmException;

public class SecretKeyGenerator {

    private SecretKeyGenerationStrategy strategy;

    public SecretKeyGenerator(SecretKeyGenerationStrategy strategy) {
        this.strategy = strategy;
    }

    public SecretKey create() throws NoSuchAlgorithmException {
        return strategy.generate();
    }
}
