package pl.sdacademy.designpatterns.adapter;

import java.util.ArrayList;
import java.util.List;

public class SystemBUserAdapter implements User {

    private final SystemBUser systemBUser;

    public SystemBUserAdapter(SystemBUser systemBUser) {
        this.systemBUser = systemBUser;
    }

    @Override
    public String getFullName() {
        return systemBUser.getFullname();
    }

    @Override
    public String getUsername() {
        int splitCharIndex = systemBUser.getFullname().indexOf(' ');
        return systemBUser.getFullname().substring(0, splitCharIndex) + "_" + systemBUser.getAge();
    }

    @Override
    public Integer getAge() {
        return Integer.valueOf(systemBUser.getAge());
    }

    @Override
    public List<String> getRoles() {
        return new ArrayList<>(systemBUser.getRoles());
    }
}
