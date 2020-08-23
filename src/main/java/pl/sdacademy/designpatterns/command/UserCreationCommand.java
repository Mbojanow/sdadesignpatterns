package pl.sdacademy.designpatterns.command;

public class UserCreationCommand implements CommandBase {

  // obiekt, który dany proces wykona - komenda go "opakowuje"
  private final UserRepository userRepository;
  private final UserData userData;

  public UserCreationCommand(final UserRepository userRepository, final UserData userData) {
    this.userRepository = userRepository;
    this.userData = userData;
  }

  @Override
  public void execute() {
    if (!userRepository.usernameWithEmailExists(userData.getEmail())) {
      userRepository.addUser(userData);
    }
  }

  @Override
  public void undo() {
    if (userRepository.usernameWithEmailExists(userData.getEmail())) {
      userRepository.removeUser(userData);
    }
  }


}
