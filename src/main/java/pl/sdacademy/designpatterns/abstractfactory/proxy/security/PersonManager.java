package pl.sdacademy.designpatterns.abstractfactory.proxy.security;

import java.util.List;

public interface PersonManager {
  void addPerson(Person person);
  void deletePerson(String email);
  List<Person> getAllPeople();
  boolean isPersonPresent(String name);
  void validateEmail(String email);
}
