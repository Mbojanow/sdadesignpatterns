package pl.sdacademy.designpatterns.abstractfactory.command;

public class UserRegistrationCommand implements CommandBase {

  private UserRepository userRepository;
  private UserData userData;

  public UserRegistrationCommand(final UserRepository userRepository, final UserData userData) {
    this.userRepository = userRepository;
    this.userData = userData;
  }

  @Override
  public void execute() {
    userRepository.addUser(userData);
  }

  @Override
  public void undo() {
    userRepository.deleteUser(userData);
  }
}
