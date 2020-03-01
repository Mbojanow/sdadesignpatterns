package pl.sdacademy.designpatterns.facade;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MultiValueAttribute {
  private Long id;
  private String name;
  private List<String> values;
}
