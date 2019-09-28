package pl.sdacademy.designpatterns.builder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class SomeClass {
  private String fieldA;
  private String name;
  private long age;
}
