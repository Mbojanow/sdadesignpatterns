package pl.sdacademy.designpatterns.adapter;

import java.util.List;

// docelowy interfejs -> z tego chce korzystac programista
public interface User {
    String getFullName();
    String getUsername();
    Integer getAge();
    List<String> getRoles();
}
