package pl.sdacademy.designpatterns.command;

public class UserRegistrationCommand implements CommandBase {

    private UserRepository userRepository;
    private UserData userData;

    public UserRegistrationCommand(UserRepository userRepository, UserData userData) {
        this.userRepository = userRepository;
        this.userData = userData;
    }

    @Override
    public void execute() {
        final boolean emailExists = userRepository.getUsers().stream()
                .anyMatch(user -> user.getEmail().equals(userData.getEmail()));
        if (!emailExists) {
            userRepository.addUser(userData);
        }
    }

    @Override
    public void undo() {
        userRepository.removeUser(userData);
    }
}
