package pl.sdacademy.designpatterns.command;

public class CommandDemo {
  public static void main(String[] args) {
    final UserBase userA = new UserBase("Andrzej", "Nowak",
        "andrzej@test.com", "Andrzej_123");
    final UserRepository userRepository = new UserRepository();

    final CommandBase commandA = new UserRegistrationCommand(userRepository, userA);
    final CommandBase commandB = new UserRegistrationCommand(userRepository, userA);

    commandA.execute();
    System.out.println(userRepository.getUsers().size());
    commandA.undo();
    System.out.println(userRepository.getUsers().size());
    commandA.execute();
    System.out.println(userRepository.getUsers().size());
    commandA.undo();

    commandA.execute();
    commandA.execute();
    System.out.println(userRepository.getUsers().size());

    commandB.execute();
    System.out.println(userRepository.getUsers().size());
    commandB.undo();
    commandA.undo();



  }
}
