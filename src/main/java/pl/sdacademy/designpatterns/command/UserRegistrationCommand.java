package pl.sdacademy.designpatterns.command;

public class UserRegistrationCommand implements CommandBase {

  // zle
  // private UserRepository userRepository = new UserRepository();

  private UserRepository userRepository;
  private UserData user;

  public UserRegistrationCommand(final UserRepository userRepository, final UserData user) {
    this.userRepository = userRepository;
    this.user = user;
  }

  @Override
  public void execute() {
    final boolean mailExists = userRepository.getUserData().stream()
        .anyMatch(ud -> ud.getEmail().equals(user.getEmail()));
    if (!mailExists) {
      userRepository.addUser(user);
    }
  }

  @Override
  public void undo() {
    userRepository.removeUser(user);
  }
}
