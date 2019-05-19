package pl.sdacademy.designpatterns.strategy;

import java.security.NoSuchAlgorithmException;

public class StrategyDemo {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        // "A" -> AES
        // każda inna -> DES
        SecretKeyGenerationStrategy strategy;
        if (args.length > 0 && args[0].equals("A")) {
            strategy = new AESSecretKeyGenerationStrategy();
        } else {
            strategy = new DESSecretKeyGenerationStrategy();
        }

        final SecretKeyGenerator secretKeyGenerator = new SecretKeyGenerator(strategy);

        System.out.println(strategy.generate().getAlgorithm());
    }
}
