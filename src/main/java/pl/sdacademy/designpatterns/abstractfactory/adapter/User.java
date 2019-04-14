package pl.sdacademy.designpatterns.abstractfactory.adapter;

import java.util.List;

public interface User {
  String getFullname();
  String getUsername();
  Integer getAge();
  List<String> getRoles();
}
