package pl.sdacademy.designpatterns.abstractfactory.command;

public class CommandDemo {

  public static void main(final String[] args) {

    final UserRepository userRepository = new UserRepository();
    final UserData userData = new UserData("Michal", "Bojanowski",
        "secret@email.com", "MySecretPassword");

    final CommandBase command = new UserRegistrationCommand(userRepository, userData);

//    command.execute();
//    userRepository.printAllNames();
//    command.undo();
//    userRepository.printAllNames();
//    command.execute();
//    userRepository.printAllNames();
//    command.undo();

    command.execute();
    command.execute();
    userRepository.printAllNames();

  }
}
