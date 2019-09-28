package pl.sdacademy.designpatterns;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Date;

public class Test {

  public static void main(final String[] args) {
    final String s = LocalDateTime.ofEpochSecond(new Date().getTime() / 1000L, 0, ZoneOffset.UTC).toString();
    System.out.println(s);
    final LocalDateTime now = LocalDateTime.now();
  }
}
