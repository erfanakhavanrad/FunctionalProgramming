package functionalInterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {

  public static void main(String[] args) {
    Customer maria = new Customer("Maria", "+98935249871");
//    Normal Java Function
    greetCustomer(maria);
    greetCustomerV2(maria, false);
//    Consumer Functional Interface
    greetCustomerConsumer.accept(maria);

    greetCustomerConsumerV2.accept(maria, false);
  }

  static BiConsumer<Customer, Boolean> greetCustomerConsumerV2 = (customer,showPhoneNumber) ->
      System.out.println("Hello " + customer.customerName + ", thanks for "
          + "registering the phone number " + (showPhoneNumber ? customer.getPhoneNumber: "*******"));

  static Consumer<Customer> greetCustomerConsumer = customer ->
      System.out.println("Hello " + customer.customerName + ", thanks for "
          + "registering the phone number " + customer.getPhoneNumber);

  static void greetCustomer(Customer customer) {
    System.out.println("Hello " + customer.customerName + ", thanks for "
        + "registering the phone number " + customer.getPhoneNumber);
  }

  static void greetCustomerV2(Customer customer, boolean showPhoneNumber) {
    System.out.println("Hello " + customer.customerName + ", thanks for "
        + "registering the phone number " + (showPhoneNumber ? customer.getPhoneNumber: "*******"));
  }

  static class Customer {

    private final String customerName;
    private final String getPhoneNumber;

    public Customer(String customerName, String getPhoneNumber) {
      this.customerName = customerName;
      this.getPhoneNumber = getPhoneNumber;
    }
  }

}
