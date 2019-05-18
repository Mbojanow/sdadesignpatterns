package pl.sdacademy.designpatterns.security;

import java.util.List;

public interface PersonManager {
  void addPerson (Person person);
  void deletePerson (String email);
  List<Person> getAllPeople();
  boolean isPersonPresent(String name);
  void validateEmail(String email);

}
