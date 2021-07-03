package pl.sdacademy.designpatterns.proxy;

import java.util.Arrays;
import java.util.List;

public enum Role {
    USER(AccessType.READ),
    ADMIN(AccessType.READ, AccessType.WRITE);

    private final List<AccessType> accessTypes;

    // każdy konstruktor ma domyslnie modyfikator private
    Role(AccessType... accessTypes) {
        // varargs to nic innego jak array
        // array ma listę -> Arrays.asList
        this.accessTypes = Arrays.asList(accessTypes);
    }

    public List<AccessType> getAccessTypes() {
        return accessTypes;
    }
}
