package pl.sdacademy.designpatterns.adapter;

import java.util.List;
import java.util.Locale;

public class SystemAUserAdapter implements User {

    // obiekt adaptowany - adaptee
    private final SystemAUser systemAUser;

    public SystemAUserAdapter(SystemAUser systemAUser) {
        this.systemAUser = systemAUser;
    }

    @Override
    public String getFullname() {
        return systemAUser.getFirstName() + systemAUser.getLastName();
    }

    @Override
    public String getUsername() {
        return systemAUser.getFirstName().toLowerCase() + "." + systemAUser.getLastName().toLowerCase();
    }

    @Override
    public Integer getAge() {
        return (int) systemAUser.getAge();
    }

    @Override
    public List<String> getRoles() {
        return systemAUser.getRoles();
    }
}
