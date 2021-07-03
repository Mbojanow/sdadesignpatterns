package pl.sdacademy.designpatterns.proxy;

public class PersonManagerProxy implements PersonManager {

    // soLid
    private final PersonManager personManager;
    private final Person manager;

    // proxy typu security
    // jeżeli manager ma access READ - może tylko czytać
    // jeżeli manager ma access WRITE - może modyfikować osoby

    public PersonManagerProxy(PersonManager personManager, Person manager) {
        this.personManager = personManager; // new PersonManagerImpl(); -> soliD
        this.manager = manager;
    }

    @Override
    public void addPerson(Person person) {
        if (manager.getRole().getAccessTypes().contains(AccessType.WRITE)) {
            personManager.addPerson(person);
        }
    }

    @Override
    public void deletePerson(String email) {
        if (manager.getRole().getAccessTypes().contains(AccessType.WRITE)) {
            personManager.deletePerson(email);
        }
    }

    @Override
    public boolean isPersonPresent(String email) {
        if (manager.getRole().getAccessTypes().contains(AccessType.READ)) {
            return personManager.isPersonPresent(email);
        }
        return false;
    }
}
