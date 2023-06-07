import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;

public class CheckoutQueue {
    private Queue<Customer> customerQueue;

    public Queue<Customer> getCustomerQueue() {
        return customerQueue;
    }

    public CheckoutQueue() {
        customerQueue = new LinkedList<>();
    }

    public void enqueue(Customer customer) {
        customerQueue.add(customer);
    }

    public Customer dequeue() {
        return customerQueue.poll();
    }

    public boolean isEmpty() {
        return customerQueue.isEmpty();
    }

    public int size() {
        return customerQueue.size();
    }

    public int getTotalWaitingTime() {
        AtomicInteger totalWaitingTime = new AtomicInteger(0);
        customerQueue.forEach(element -> {
            totalWaitingTime.addAndGet(element.calculateTimeInCheckout());
        });
        return totalWaitingTime.get();
    }

    public int averageWaitingTime() {
        int totalWaitingTime = 0;
        int customerCount = customerQueue.size();

        if (customerCount == 0) {
            // Manejar el caso cuando no hay clientes en la cola
            // Por ejemplo, lanzar una excepción o devolver un valor predeterminado
            throw new RuntimeException("No hay clientes en la cola");
        }

        for (Customer customer : customerQueue) {
            totalWaitingTime += customer.calculateTimeInCheckout();
        }

        return totalWaitingTime / customerCount;
    }

}
