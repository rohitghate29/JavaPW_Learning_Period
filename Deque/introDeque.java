import java.util.ArrayDeque;
import java.util.Deque;

public class introDeque{
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

        deque.addFirst(1);
        deque.addLast(2);
        deque.addFirst(3);
        deque.addLast(4);
        deque.addFirst(5);
        System.out.println("deque before deletion: "+deque);

        deque.removeFirst();
        System.out.println("deque after deletion: "+deque);

        deque.removeLast();
        System.out.println("deque after deletion: "+deque);

    }
}