package pl.sdacademy.designpatterns.strategy;

public class SecretKeyGeneratorProvider {
    public SecretKeyGenerationStrategy get(String type) {
        SecretKeyAlgorithm secretKeyAlgorithm = SecretKeyAlgorithm.valueOf(type);
        //sOlid
        switch (secretKeyAlgorithm) {
            case AES:
                return new AESSecretKeyGenerationStrategy();
            case DES:
                return new DESSecretKeyGenerationStrategy();
            case HMAC_SHA256:
                return new HmacSHA256SecretKeyGenerationStrategy();
        }
        throw new RuntimeException("Unsupported algorithm type");
    }
}
