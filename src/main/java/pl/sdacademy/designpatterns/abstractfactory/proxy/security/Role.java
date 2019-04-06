package pl.sdacademy.designpatterns.abstractfactory.proxy.security;

import java.util.Arrays;
import java.util.List;

public enum Role {
  USER(AccessType.READ),
  ADMIN(AccessType.READ, AccessType.WRITE);

  private List<AccessType> accessType;

  Role(final AccessType... accessTypes) {
    this.accessType = Arrays.asList(accessTypes);
  }

  public List<AccessType> getAccessType() {
    return accessType;
  }
}
