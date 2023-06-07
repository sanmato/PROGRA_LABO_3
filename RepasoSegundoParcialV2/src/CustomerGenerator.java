import java.util.Random;

public class CustomerGenerator {

    private static final Random random = new Random();

    public static Customer generateCustomer() {
        PaymentMethod paymentMethod = getRandomPaymentMethod();
        CustomerType customerType = getRandomCustomerType();
        int numberOfItems = getRandomNumberOfItems();

        return new Customer(paymentMethod, customerType, numberOfItems);
    }

    private static PaymentMethod getRandomPaymentMethod() {
        PaymentMethod[] paymentMethods = PaymentMethod.values();
        int randomIndex = random.nextInt(paymentMethods.length);
        return paymentMethods[randomIndex];
    }

    private static CustomerType getRandomCustomerType() {
        CustomerType[] customerTypes = CustomerType.values();
        int randomIndex = random.nextInt(customerTypes.length);
        return customerTypes[randomIndex];
    }

    private static int getRandomNumberOfItems() {
        return random.nextInt(20) + 1;
    }
}
