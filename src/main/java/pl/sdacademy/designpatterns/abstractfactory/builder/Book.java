package pl.sdacademy.designpatterns.abstractfactory.builder;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Book {
  private int pagesNum;
  private String title;
  private String author;
}
