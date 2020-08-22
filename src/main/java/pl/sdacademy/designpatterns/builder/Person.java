package pl.sdacademy.designpatterns.builder;

import lombok.Builder;

@Builder
public class Person {
  private String name;
  private String surname;
  private Integer age;

  public Person(final String name, final String surname, final Integer age) {
    this.name = name;
    this.surname = surname;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(final String name) {
    this.name = name;
  }

  public String getSurname() {
    return surname;
  }

  public void setSurname(final String surname) {
    this.surname = surname;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(final Integer age) {
    this.age = age;
  }
}
