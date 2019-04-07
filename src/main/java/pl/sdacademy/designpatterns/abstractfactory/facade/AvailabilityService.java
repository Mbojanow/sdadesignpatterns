package pl.sdacademy.designpatterns.abstractfactory.facade;

import java.util.Random;

public class AvailabilityService {

  public boolean isAvailable(final int id) {
    return new Random().nextBoolean();
  }
}
