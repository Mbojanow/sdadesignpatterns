package pl.sdacademy.designpatterns.proxy;

public class ProxyDemo {
    public static void main(String[] args) {
        Person user = new Person("Ania", "ania@test.com", Role.USER, false);
        Person admin = new Person("Ala", "ala@test.com", Role.ADMIN, true);

        PersonsManagingService personsManagingService = new PersonManagingServiceImpl();
        PersonsManagingService proxy = new PersonsManagingServiceProxy(personsManagingService, admin);

        System.out.println(proxy.getAllPersons().size());
        proxy.addPerson(user);
        System.out.println(proxy.getAllPersons().size());
    }
}
