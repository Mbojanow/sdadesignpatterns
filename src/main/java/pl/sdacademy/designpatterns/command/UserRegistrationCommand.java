package pl.sdacademy.designpatterns.command;

import pl.sdacademy.designpatterns.adapter.User;

public class UserRegistrationCommand implements CommandBase {

  private UserRepository userRepository;
  private UserBase user;

  public UserRegistrationCommand(final UserRepository userRepository, final UserBase user) {
    // jest okej
    this.userRepository = userRepository;
    // NIE OKEJ
    // this.userRepository = new UserRepository();
    this.user = user;
  }

  @Override
  public void execute() {
    if (!userRepository.getUsers().contains(user)) {
      userRepository.addUser(user);
    }
  }

  @Override
  public void undo() {
    if (!userRepository.getUsers().contains(user)) {
      // lepiej wyrzucic wyjatek wlasnego typu
      throw new RuntimeException("user was already deleted");
    }
    userRepository.removeUser(user);
  }
}
