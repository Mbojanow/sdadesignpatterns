package pl.sdacademy.designpatterns.adapter.systema;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import pl.sdacademy.designpatterns.adapter.User;

// adapter -> implementuje docelowy interfejs
public class SystemAUserAdapter implements User {

  private static long globalIndex = 0;

  // adaptee -> obiekt adaptowany
  private SystemAUser systemAUser;

  private long index;

  public SystemAUserAdapter(final SystemAUser systemAUser) {
    this.systemAUser = systemAUser;
    this.index = globalIndex++;
  }

  @Override
  public String getFullname() {
    return systemAUser.getFirstName() + " " + systemAUser.getLastName();
  }

  @Override
  public String getUsername() {
    final String indexAsString = String.valueOf(index);
    // TODO: use consts
    final int lengthWithZeros = 4 - indexAsString.length();
    final String suffix = Stream.generate(() -> "0")
        .limit(lengthWithZeros)
        .collect(Collectors.joining()) + index;
    return systemAUser.getFirstName() + "_" + systemAUser.getLastName() + suffix;
  }

  @Override
  public Integer getAge() {
    return (int)systemAUser.getAge();
  }

  @Override
  public List<String> getRoles() {
    return systemAUser.getRoles();
  }
}
