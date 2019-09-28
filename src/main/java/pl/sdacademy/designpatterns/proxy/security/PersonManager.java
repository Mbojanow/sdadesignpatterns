package pl.sdacademy.designpatterns.proxy.security;

import java.util.List;

public interface PersonManager {
  void addPerson(Person person);
  void deletePerson(String emaial);
  List<Person> getAllPeople();
  boolean isPersonPresent(String name);
  void validateEmail(String email);
}
