package pl.sdacademy.designpatterns.command;

public class CommandDemo {
  public static void main(String[] args) {

    final UserRepository userRepository = new UserRepository();
    final UserData userA = new UserData("asd@gmail.com", "Andrzej", "Nowal", "Nowak_123");
    final UserData userB = new UserData("asd@gmail.com", "Jan", "Jankowski", "Pass_123");

    final CommandBase commandA = new UserRegistrationCommand(userRepository, userA);
    final CommandBase commandB = new UserRegistrationCommand(userRepository, userB);

    commandA.execute();
    commandA.execute();
    commandA.undo();
    commandA.execute();
    commandA.undo();
    commandB.execute();
    commandA.execute();

    userRepository.getUserData().forEach(user -> System.out.println(user.getSurname()));


    processJavaGda26Consumer(x -> {
      final int y = 2;
      System.out.println(x + y);
    });
  }

  public static void processJavaGda26Consumer(final JavaGda26Consumer<String> str) {
    str.customConsume("hello");
  }
}
