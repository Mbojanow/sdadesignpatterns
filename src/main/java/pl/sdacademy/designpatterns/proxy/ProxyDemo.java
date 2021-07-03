package pl.sdacademy.designpatterns.proxy;

public class ProxyDemo {
    public static void main(String[] args) {
        Person ala = new Person("ala@test.com", Role.USER, true);
        Person andrzej = new Person("andrzej@test.com", Role.ADMIN, true);

        PersonManager personManager = new PersonManagerImpl();

        PersonManager proxy = new PersonManagerProxy(personManager, andrzej);//ala -> false
        proxy.addPerson(andrzej);
        proxy.addPerson(ala);
        System.out.println(proxy.isPersonPresent("ala@test.com"));
    }
}
