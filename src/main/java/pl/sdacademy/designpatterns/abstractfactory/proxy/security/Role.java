package pl.sdacademy.designpatterns.abstractfactory.proxy.security;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum Role {
  USER(AccessType.READ),
  ADMIN(AccessType.READ, AccessType.WRITE);

  private List<AccessType> accessTypes;

  Role(final AccessType... accessTypes) {
    accessTypes = Arrays.stream(accessTypes).collect(Collectors.toList());
  }
}
