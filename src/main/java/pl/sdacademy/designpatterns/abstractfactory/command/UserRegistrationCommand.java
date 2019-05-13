package pl.sdacademy.designpatterns.abstractfactory.command;

public class UserRegistrationCommand implements CommandBase {

  private UserData user;
  private UserRepository userRepository;

  public UserRegistrationCommand(final UserData user, final UserRepository userRepository) {
    this.user = user;
    this.userRepository = userRepository;
  }

  @Override
  public void execute() {
    userRepository.addUser(user);
  }

  @Override
  public void undo() {
    userRepository.removeUser(user);
  }
}
