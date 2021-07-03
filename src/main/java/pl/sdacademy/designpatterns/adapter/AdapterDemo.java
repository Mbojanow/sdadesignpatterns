package pl.sdacademy.designpatterns.adapter;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class AdapterDemo {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        SystemAUser systemAUser = new SystemAUser("andrzej", "andrzejewski", 32L, List.of("USER"));
        users.add(new SystemAUserAdapter(systemAUser));

        SystemBUser systemBUser = new SystemBUser("ala nowak", "ala.nowak", "22", Set.of("ADMIN"));
        users.add(new SystemBUserAdapter(systemBUser));

        for (User user: users) {
            System.out.println(user);
        }
    }
}
