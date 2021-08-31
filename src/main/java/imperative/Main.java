package imperative;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args) {
    List<Person> people = List.of(
        new Person("John", Gender.Male),
        new Person("Maria", Gender.Female),
        new Person("Aisha", Gender.Female),
        new Person("Alex", Gender.Male),
        new Person("Alice", Gender.Female)
    );

    System.out.println("Imperative approach");
//    Imperative approach
    List<Person> females = new ArrayList<>();
    for (Person person : people) {
      if (Gender.Female.equals(person.gender)) {
        females.add(person);
      }
    }

    for (Person female: females){
      System.out.println(female);
    }
    System.out.println("Declarative Approach");
//    Declarative Approach
    people.stream().filter(person -> Gender.Female.equals(person.gender))
//        .collect(Collectors.toList())
        .forEach(System.out::println);






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
    Male, Female
  }

}

