package pl.sdacademy.designpatterns.security;

public class SecurityDemo {

  public static void main(String[] args) {
    final Person admin = new Person("tomasz", "tom@tom.com", null, null,
        Role.ADMIN, 0, true );
    final Person rookie = new Person("andrzej", "tom@tom.com", null, null,
        Role.USER, 0, true );

    PersonManager personManager = new PersonManagerProxy(rookie);
    personManager.addPerson(admin);
    System.out.println(personManager.getAllPeople().size());
  }
}
