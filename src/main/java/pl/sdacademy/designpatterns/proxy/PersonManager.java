package pl.sdacademy.designpatterns.proxy;

// interfejs docelowy
public interface PersonManager {
    void addPerson(Person person);
    void deletePerson(String email);
    boolean isPersonPresent(String email);
}
