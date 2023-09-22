//Implementation of queue using LinkedList

import java.util.LinkedList;
import java.util.Queue;

public class introToQueue {
    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();

        // to add the data inside the queue
        for (int i = 0; i < 10; i++) {
            q.add(i);
        }

        System.out.println("Queue data looks like: " + q);

        // To display the top element present in the queue
        System.out.println("The top element in the queue before deletion is: " + q.peek());

        // to remove element from the queue
        q.remove();

        // To display the top element present in the queue after deletion
        System.out.println("The top element in the queue after deletion is: " + q.peek());

        System.out.println("The current size of the queue is: " + q.size());
    }
}
