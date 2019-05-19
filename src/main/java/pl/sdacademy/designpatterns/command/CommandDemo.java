package pl.sdacademy.designpatterns.command;

public class CommandDemo {
    public static void main(String[] args) {

        final UserRepository userRepository = new UserRepository();
        final UserData userDataA = new UserData("Michal", "Bocian",
                "test@gmail.com", "Michal_123");
        final  UserData userDataB = new UserData("Andrzej", "Bocian",
                "test@gmail.com", "Andrzej_123");

        final CommandBase commandBaseA = new UserRegistrationCommand(userRepository, userDataA);
        final CommandBase commandBaseB = new UserRegistrationCommand(userRepository, userDataB);

        commandBaseA.execute();
        commandBaseA.undo();
        commandBaseA.execute();
        commandBaseA.undo();
        commandBaseB.execute();
        commandBaseA.execute();

        System.out.println(userRepository.getUsers().get(0).getName());
    }
}
