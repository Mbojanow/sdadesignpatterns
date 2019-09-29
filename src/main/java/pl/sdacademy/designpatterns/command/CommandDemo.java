package pl.sdacademy.designpatterns.command;

public class CommandDemo {
  public static void main(String[] args) {
    final UserRepository userRepository = new UserRepository();
    final UserData userA = UserData.builder()
        .email("andrzej@gmail.com")
        .name("Andrzej")
        .surname("Nowak")
        .password("DSadweq_dsah321")
        .build();

    final UserData userB = UserData.builder()
        .email("andrzej@gmail.com")
        .name("Ola")
        .surname("Nowak")
        .password("dsadeqwqwewq")
        .build();

    final CommandBase commandA = new UserRegistrationCommand(userRepository, userA);
    final CommandBase commandB = new UserRegistrationCommand(userRepository, userB);

    commandA.execute();
    commandA.undo();
    commandA.execute();
    commandA.undo();
    commandB.execute();
    commandB.execute();
    commandA.execute();

    System.out.println(userRepository);
    System.out.println(userRepository.getUsers().get(0).getName());


  }
}
