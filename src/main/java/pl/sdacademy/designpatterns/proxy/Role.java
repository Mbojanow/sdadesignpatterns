package pl.sdacademy.designpatterns.proxy;

import lombok.Data;
import lombok.Getter;

import java.util.Arrays;
import java.util.List;

//@Data = @Getter + @Setter + @EqualsAndHashCode + @ToString
public enum Role {
    USER(AccessType.READ),
    ADMIN(AccessType.READ, AccessType.WRITE);

    private List<AccessType> accessTypes;

    Role(AccessType... accessTypes) {
        this.accessTypes = Arrays.asList(accessTypes);
    }

    public List<AccessType> getAccessTypes() {
        return accessTypes;
    }
}
