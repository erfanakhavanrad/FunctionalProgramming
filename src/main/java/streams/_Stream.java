package streams;

import imperative.Main;
import java.util.List;
import java.util.stream.Collectors;

public class _Stream {

  public static void main(String[] args) {
    List<Person> people = List.of(
        new Person("John", Gender.Male),
        new Person("Maria", Gender.Female),
        new Person("Aisha", Gender.Female),
        new Person("Alex", Gender.Male),
        new Person("Bob", Gender.Other)
    );

//    people.stream()
//        .map(person -> person.name)
//        .mapToInt(String::length)
//        .forEach(System.out::println);

    boolean containOnlyFemales = people.stream()
        .allMatch(person -> Gender.Female.equals(person.gender));
    System.out.println(containOnlyFemales);

  }
  static class Person {

    private final String name;
    private final Gender gender;

    @Override
    public String toString() {
      return "Person{" +
          "name='" + name + '\'' +
          ", gender=" + gender +
          '}';
    }

    public Person(String name, Gender gender) {
      this.name = name;
      this.gender = gender;
    }
  }

  enum Gender {
    Male, Female,Other
  }
}
