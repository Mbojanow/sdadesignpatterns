package pl.sdacademy.designpatterns.command;

public class UserRegistrationCommand implements CommandBase {

  private final UserRepository userRepository;
  private final UserData user;

  public UserRegistrationCommand(final UserRepository userRepository, final UserData user) {
    this.userRepository = userRepository;
    this.user = user;
  }

  @Override
  public void execute() {
    if (userRepository.getUsers().stream()
        .noneMatch(userData -> userData.getEmail().equals(user.getEmail()))) {
      userRepository.addUser(user);
    }
  }

  @Override
  public void undo() {
    userRepository.removeUser(user);
  }
}
