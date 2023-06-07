import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonIOException;

public class SuperMarket {
    private List<CheckoutQueue> checkoutQueueList;

    public SuperMarket(int numberOfCheckoutQueues) {
        checkoutQueueList = new ArrayList<>();

        for (int i = 0; i < numberOfCheckoutQueues; i++) {
            checkoutQueueList.add(new CheckoutQueue());
        }
    }

    public List<CheckoutQueue> getCheckoutQueues() {
        return checkoutQueueList;
    }

    public double averageWaitingTime() {
        int totalCustomers = 0;
        int totalWaitingTime = 0;

        for (CheckoutQueue queue : checkoutQueueList) {
            totalCustomers += queue.size();
            totalWaitingTime += queue.getTotalWaitingTime();
        }

        return totalWaitingTime / (double) totalCustomers;
    }

    private CheckoutQueue findShortestQueue() {
        CheckoutQueue shortestQueue = null;

        for (CheckoutQueue queue : checkoutQueueList) {
            if (shortestQueue == null || queue.size() < shortestQueue.size()) {
                shortestQueue = queue;
            }
        }

        return shortestQueue;
    }

    public void addCustomerToQueue(Customer customer, int queueIndex) {
        if (queueIndex >= 0 && queueIndex < checkoutQueueList.size()) {
            CheckoutQueue targetQueue = checkoutQueueList.get(queueIndex);
            CheckoutQueue shortestQueue = findShortestQueue();

            if (shortestQueue != null && shortestQueue.size() <= targetQueue.size()) {
                shortestQueue.enqueue(customer);
            } else {
                targetQueue.enqueue(customer);
            }
        }
    }

    public void generateJson(String filePath, List<CheckoutQueue> checkOutQueueList) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        try (FileWriter writer = new FileWriter(filePath)) {
            gson.toJson(checkOutQueueList, writer);
        } catch (JsonIOException | IOException e) {
            e.printStackTrace();
        }
    }

    public void simulateCheckout() throws ExcessiveCardProblemException {
        checkoutQueueList.forEach(checkout -> {
            int totalTime = 0;
            int previousCustomerTime = 0;
            int customerCountWithCardProblems = 0;

            while (!checkout.isEmpty()) {
                Customer customer = checkout.dequeue();
                int customerTime = customer.calculateTimeInCheckout();
                totalTime += customerTime;

                if (customer.getPaymentMethod() == PaymentMethod.TARJETA_CON_PROBLEMAS) {
                    customerCountWithCardProblems++;
                    if (customerCountWithCardProblems > 3) {
                        try {
                            throw new ExcessiveCardProblemException("More than 3 customers with problems");
                        } catch (ExcessiveCardProblemException e) {
                            e.printStackTrace();
                        }
                    }
                }

                int waitTime = totalTime - previousCustomerTime;
                System.out.println("Customer in queue " + checkout + " took" + waitTime + " seconds.");
                previousCustomerTime = totalTime;
            }
            System.out.println("Total time for queue " + checkout + ": " + totalTime + " seconds.");
        });
    }

}
