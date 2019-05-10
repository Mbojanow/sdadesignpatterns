package pl.sdacademy.designpatterns.facade;

import java.util.Random;

public class AvailabilityService {

    public boolean isAvailable(final Product product) {
        return new Random().nextBoolean();
    }
}
