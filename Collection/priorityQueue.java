import java.util.PriorityQueue;
import java.util.*;

public class priorityQueue {
    public static void main(String[] args) {

        PriorityQueue pq = new PriorityQueue();
        pq.add(100);
        pq.add(50);
        pq.add(150);
        pq.add(25);
        pq.add(75);
        pq.add(125);
        pq.add(175);

        System.out.println(pq);

        PriorityQueue pq2 = new PriorityQueue();
        pq2.add(50);
        pq2.add(100);
        pq2.add(25);
        pq2.add(75);

        System.out.println(pq2);
    }
}
