import java.util.LinkedList;
import java.util.Queue;

public class GenericWaitQueue<T> {
    private Queue<T> waitList;

    public GenericWaitQueue() {
        waitList = new LinkedList<>();
    }

    public Queue<T> getWaitList() {
        return waitList;
    }

    public void setWaitList(Queue<T> waitList) {
        this.waitList = waitList;
    }

    public void enqueue(T customer) {
        waitList.add(customer);
    }

    public T dequeue() {
        return waitList.poll();
    }

}
