package pl.sdacademy.designpatterns.proxy;

import java.util.ArrayList;
import java.util.List;

public class PersonManagerImpl implements PersonManager {

    private final List<Person> people = new ArrayList<>();

    @Override
    public void addPerson(Person person) {
        if (people.stream().noneMatch(p -> p.getEmail().equals(person.getEmail()))) {
            people.add(person);
        } else {
            // lepiej wyrzucić wyjątek własnego typu
            throw new RuntimeException("Email already taken");
        }
    }

    @Override
    public void deletePerson(String email) {
        people.stream()
                .filter(person -> person.getEmail().equals(email))
                .findFirst()
                .ifPresent(person -> people.remove(person));
    }

    @Override
    public boolean isPersonPresent(String email) {
        return people.stream()
                .anyMatch(person -> person.getEmail().equals(email));
    }
}
