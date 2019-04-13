package pl.sdacademy.designpatterns.proxy.security;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PersonManagmentService implements PersonManager {

    private List<Person> persons = new ArrayList<>();

    @Override
    public void addPerson(final Person person) {
        if (persons.contains(person) || persons.stream().anyMatch(p -> p.getEmail().equals(person.getEmail()))) {
            throw new RuntimeException("person already exists or email taken");
        }
        persons.add(person);
    }

    @Override
    public void deletePerson(final String email) {
        persons.stream()
                .filter(person -> person.getEmail().equals(email))
                .findFirst()
                .map(person -> persons.remove(person));
    }

    @Override
    public List<Person> getAllPeople() {
        return persons;
    }

    @Override
    public boolean isPersonPresent(final String name) {
        return persons.stream()
                .anyMatch(person -> person.getName().equals(name));
    }

    @Override
    public void validateEmail(final String email) {
        persons.stream()
                .filter(person -> person.getEmail().equals(email))
                .findFirst()
                .ifPresent(person -> person.setVerified(true));
    }

    public List<Person> getPersons() {
        return persons;
    }
}
