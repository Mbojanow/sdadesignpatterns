package pl.sdacademy.designpatterns.adapter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SystemAUserAdapter implements User {

  private static final Map<String, Integer> usernameToIndex = new HashMap<>();

  private final SystemAUser systemAUser;

  public SystemAUserAdapter(final SystemAUser systemAUser) {
    this.systemAUser = systemAUser;
  }

  @Override
  public String getFullname() {
    return systemAUser.getFirstName() + " " + systemAUser.getLastName();
  }

  @Override
  public String getUsername() {
    final String usernameBase = systemAUser.getFirstName() + systemAUser.getLastName();
    int index;
    if (!usernameToIndex.containsKey(usernameBase)) {
      usernameToIndex.put(usernameBase, 1);
      index = 1;
    } else {
      final int lastIndex = usernameToIndex.get(usernameBase);
      usernameToIndex.put(usernameBase, lastIndex + 1);
      index = lastIndex + 1;
    }
    return usernameBase + index;
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
