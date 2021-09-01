package optionals;

import java.util.Optional;
import java.util.function.Supplier;

public class Main {

  public static void main(String[] args) {

    Supplier<IllegalStateException> exception = () ->
        new IllegalStateException("Exception");

    Object value = Optional.ofNullable("Hello")
        .orElseGet(() -> "default value");
    System.out.println(value);

    Optional.ofNullable("John@gmail.com")
        .ifPresent(System.out::println);

    Optional.ofNullable(null)
        .ifPresentOrElse(email -> System.out.println("Sending email to " + email), () ->
            System.out.println("Cannot send email"));

  }
}
