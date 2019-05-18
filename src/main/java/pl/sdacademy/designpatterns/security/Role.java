package pl.sdacademy.designpatterns.security;

import java.util.Arrays;
import java.util.List;

public enum Role {
  USER(AccessType.READ),
  ADMIN(AccessType.READ, AccessType.WRITE);

  private List<AccessType> accessTypes;

  Role(AccessType ...accessTypes){
    this.accessTypes = Arrays.asList(accessTypes);
  }

  public List<AccessType> getAccessTypes() {
    return accessTypes;
  }
}
