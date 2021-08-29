package pl.sdacademy.designpatterns.adapter;

import java.util.List;

// User -> typ wyjściowy
public class SystemAUserAdapter implements User {

    private final SystemAUser systemAUser;

    // typ  - instancja - wejściowy - konstruktor
    public SystemAUserAdapter(SystemAUser systemAUser) {
        this.systemAUser = systemAUser;
    }

    @Override
    public String getFullName() {
        return systemAUser.getFirstName() + " " + systemAUser.getLastName();
    }

    @Override
    public String getUsername() {
        return systemAUser.getLastName() + "_" + systemAUser.getAge();
    }

    @Override
    public Integer getAge() {
        return (int)systemAUser.getAge();
    }

    @Override
    public List<String> getRoles() {
        return systemAUser.getRoles();
    }
}
