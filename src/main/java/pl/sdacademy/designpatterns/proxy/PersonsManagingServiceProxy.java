package pl.sdacademy.designpatterns.proxy;

import java.util.List;

public class PersonsManagingServiceProxy implements PersonsManagingService {

    // opakowywany, kontrolowany przez proxy obiekt
    private final PersonsManagingService personsManagingService;
    private final Person operatingPerson;

    public PersonsManagingServiceProxy(PersonsManagingService personsManagingService, Person operatingPerson) {
        this.personsManagingService = personsManagingService;
        this.operatingPerson = operatingPerson;
    }

    @Override
    public void addPerson(Person person) {
        if (hasAccessType(AccessType.WRITE)) {
            personsManagingService.addPerson(person);
        }
    }

    @Override
    public void deletePersonByEmail(String email) {
        if (hasAccessType(AccessType.WRITE)) {
            personsManagingService.deletePersonByEmail(email);
        }
    }

    @Override
    public List<Person> getAllPersons() {
        if (hasAccessType(AccessType.READ)) {
            return personsManagingService.getAllPersons();
        }
        return List.of();
    }

    @Override
    public boolean isPersonPresent(String name) {
        if (hasAccessType(AccessType.READ)) {
            return personsManagingService.isPersonPresent(name);
        }
        return false;
    }

    @Override
    public void verifyEmail(String email) {
        if (hasAccessType(AccessType.WRITE)) {
            personsManagingService.verifyEmail(email);
        }
    }

    private boolean hasAccessType(AccessType accessType) {
        return operatingPerson.getRole().getAccessTypes().contains(accessType);
    }
}
