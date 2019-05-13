package pl.sdacademy.designpatterns.abstractfactory.command;

public class CommandDemo {

  public static void main(final String[] args) {

    final UserRepository userRepository = new UserRepository();

    final UserData userDataA = new UserData("Andrzej", "Nowak",
        "andzej@gmail.com", "Andrzej_123");
    final UserData userDataB = new UserData("Ala", "Kot",
        "alamakota@gmail.com", "Kot_123");

    final CommandBase userACommand
        = new UserRegistrationCommand(userDataA, userRepository);
    final CommandBase userBCommand
        = new UserRegistrationCommand(userDataB, userRepository);

    System.out.println(userRepository);
    userACommand.execute();
    userBCommand.execute();
    System.out.println(userRepository);
    userACommand.undo();
    System.out.println(userRepository);
    userACommand.execute();
    System.out.println(userRepository);
  }
}
