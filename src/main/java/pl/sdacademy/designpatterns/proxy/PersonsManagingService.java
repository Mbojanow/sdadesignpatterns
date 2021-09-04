package pl.sdacademy.designpatterns.proxy;

import java.util.List;

public interface PersonsManagingService {
    void addPerson(Person person);
    void deletePersonByEmail(String email);
    List<Person> getAllPersons();
    boolean isPersonPresent(String name);
    void verifyEmail(String email);
}
