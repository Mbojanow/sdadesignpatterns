package pl.sdacademy.designpatterns.adapter;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class AdapterDemo {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        SystemAUser systemAUser = new SystemAUser("Jan", "Kowalski", 28L, List.of("ADMIN"));
        SystemBUser systemBUser = new SystemBUser("Andrzej Andrzejewski", "SuperAndrzej", "30", Set.of("ADMIN", "USER"));
        users.add(new SystemAUserAdapter(systemAUser));
        users.add(new SystemBUserAdapter(systemBUser));

        users.forEach(user -> {
            System.out.println(user.getUsername());
            System.out.println(user.getAge());
            System.out.println(user.getFullName());
            System.out.println(user.getRoles());
        });
    }
}
