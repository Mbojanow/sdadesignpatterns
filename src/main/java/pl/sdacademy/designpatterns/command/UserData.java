package pl.sdacademy.designpatterns.command;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class UserData {
  private String name;
  private String surname;
  private String email;
  private String password;
}
