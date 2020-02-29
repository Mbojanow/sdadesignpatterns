package pl.sdacademy.designpatterns.adapter;

import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SystemBUser {
  private String fullName;
  private String displayName;
  private String age;
  private Set<String> roles;
}
