package pl.sdacademy.designpatterns.proxy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    private String username;
    private String email;
    private Role role;
    private Boolean verified;
}
