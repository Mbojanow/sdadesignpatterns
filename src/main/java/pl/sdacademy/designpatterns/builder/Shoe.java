package pl.sdacademy.designpatterns.builder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data // gettery, settery, equals hashcode, tostring
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Shoe {
    private String brand;
    private Integer size;
    private String color;
}
