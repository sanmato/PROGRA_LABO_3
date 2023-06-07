public class Main {
    public static void main(String[] args) throws Exception {
        Customer c1 = CustomerGenerator.generateCustomer();
        Customer c2 = CustomerGenerator.generateCustomer();
        Customer c3 = CustomerGenerator.generateCustomer();
        Customer c4 = CustomerGenerator.generateCustomer();
        Customer c5 = CustomerGenerator.generateCustomer();
        Customer c6 = CustomerGenerator.generateCustomer();
        Customer c7 = CustomerGenerator.generateCustomer();
        Customer c8 = CustomerGenerator.generateCustomer();

        GenericWaitQueue<Customer> myWaitList = new GenericWaitQueue<>();

        myWaitList.enqueue(c1);
        myWaitList.enqueue(c2);
        myWaitList.enqueue(c3);
        myWaitList.enqueue(c4);
        myWaitList.enqueue(c5);
        myWaitList.enqueue(c6);
        myWaitList.enqueue(c7);
        myWaitList.enqueue(c8);

        SuperMarket mySuperMarket = new SuperMarket(3);

        mySuperMarket.addCustomerToQueue(c1, 0);
        mySuperMarket.addCustomerToQueue(c2, 1);
        mySuperMarket.addCustomerToQueue(c3, 2);
        mySuperMarket.addCustomerToQueue(c4, 3);
        mySuperMarket.addCustomerToQueue(c5, 1);

        mySuperMarket.generateJson("data.json", mySuperMarket.getCheckoutQueues());
    }
}