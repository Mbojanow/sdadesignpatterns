package pl.sdacademy.designpatterns.proxy;

import java.util.ArrayList;
import java.util.List;

// Impl - w nazwie klasy - nie stosujemy
public class PersonManagingServiceImpl implements PersonsManagingService {

    private final List<Person> persons = new ArrayList<>();

    @Override
    public void addPerson(Person person) {
        boolean canBeInserted = persons.stream()
                .noneMatch(existingPerson -> existingPerson.getEmail().equals(person.getEmail()));
        if (canBeInserted) {
            persons.add(person);
        }
    }

    @Override
    public void deletePersonByEmail(String email) {
        persons.stream()
                .filter(person -> person.getEmail().equals(email)) // co najwyżej 1 element
                .findFirst() // przechodzizmy na optional
                .ifPresent(persons::remove); // person -> persons.remove(person)
    }

    @Override
    public List<Person> getAllPersons() {
        return persons;
    }

    @Override
    public boolean isPersonPresent(String name) {
        return persons.stream()
                .anyMatch(person -> person.getUsername().equals(name));
        /*  persons.stream()
                .filter(person -> person.getUsername().equals(name))
                .count() > 0;

         */
    }

    @Override
    public void verifyEmail(String email) {
        persons.stream()
                .filter(person -> person.getEmail().equals(email)) // co najwyżej 1 element
                .findFirst() // przechodzizmy na optional
                .ifPresent(person -> person.setVerified(true));
    }
}
