package pl.sdacademy.designpatterns.adapter;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SystemAUser {
  private String firstName;
  private String lastName;
  private long age;
  private List<String> roles;
}
