package pl.sdacademy.designpatterns.proxy.security;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Person {
  private String name;
  private String email;
  private String phone;
  private LocalDate birthDate;
  private Role role;
  private int numOfLogins;
  private boolean verified;
}
