package pl.sdacademy.designpatterns.proxy.security;

import java.util.List;

public interface PersonManagerService {
  void addPerson(Person person);
  void deletePerson(String email);
  List<Person> getAllPeople();
  boolean isPersonPresent(String name);
  void validateEmail(String email);
}
