package lambda;

public interface PersonFactory<P extends Person> {
  P create(String name, String lastName);
}

class Person {
  private final String firstName;
  private final String lastName;

  public Person(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  @Override
  public String toString() {
    return "Person{" +
        "firstName='" + firstName + '\'' +
        ", lastName='" + lastName + '\'' +
        '}';
  }
}

class TestPersonFactory {

  public static void main(String[] args) {
    PersonFactory<Person> personFactory = Person::new;
    Person person1 = personFactory.create("Ivan", "Sysanin");
    System.out.println(person1.toString());
  }
}