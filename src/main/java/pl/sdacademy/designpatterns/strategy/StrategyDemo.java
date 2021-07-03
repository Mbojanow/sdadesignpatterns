package pl.sdacademy.designpatterns.strategy;

import javax.crypto.SecretKey;
import java.security.NoSuchAlgorithmException;

/*
tekst

Jakie przykładowe zDanie

algorytm -> przetransformować

// SNAKE_CASE kazde_slowo_z_malej_litery_oddzielone_podloga
// CAMEL_CASE zeKazdeKolejneSlowoJestPisaneWielkaLitera
// KEBAB_CASE ale-kazde-slowo-oddzielone-myslinkiem

 */

public class StrategyDemo {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        String userChoice = "AES";
        SecretKeyGenerationStrategy strategy = new SecretKeyGeneratorProvider().get(userChoice);
        SecretKey generate = strategy.generate();
        System.out.println(generate.getAlgorithm());
    }
}
