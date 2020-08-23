package pl.sdacademy.designpatterns.command;

public class CommandDemo {
  public static void main(String[] args) {
    UserData userData = new UserData("Adam", "adam@test.com", "Adam_123");
    UserRepository userRepository = new UserRepository();
    CommandBase commandBase = new UserCreationCommand(userRepository, userData);

    commandBase.execute();
    commandBase.undo();
    commandBase.execute();
    System.out.println(userRepository.usernameWithEmailExists("adam@test.com"));
    commandBase.execute();
    commandBase.execute();
    commandBase.execute();
    System.out.println(userRepository.usernameWithEmailExists("adam@test.com"));
  }
}
