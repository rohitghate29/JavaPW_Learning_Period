import java.util.LinkedList;
import java.util.Queue;

// Implementation of stack data structure using queue
// time complexity add: O(n)
// time complexity remove: O(1)
// space complexity: O(n)

public class stackUsingQueue {

    static Queue<Integer> q1 = new LinkedList<>();
    static Queue<Integer> q2 = new LinkedList<>();

    //add element in the stack
    // Time complexity O(n)
    static void add(int data){
        // move all the data elements from q1 to q2 
        while(!q1.isEmpty()){
            q2.add(q1.peek());
            q1.poll();
        }

        // 2. Insert the new data in q1
        q1.add(data);

        // 3. Move back all the data elements from q2 to q1
        while(!q2.isEmpty()){
            q1.add(q2.peek());
            q2.poll();
        }
    }

    //to remove the elements from the stack
    // Time complexity : O(1)
    static int remove(){
        if(q1.isEmpty()){
            System.out.println("Stack underflow");
            System.exit(0);
        }

        int ele = q1.peek();
        q1.poll();
        return ele;
    }
    public static void main(String[] args) {
        stackUsingQueue s = new stackUsingQueue();

        s.add(2);
        s.add(5);
        s.add(6);
        s.add(7);

        //pop the element from the stack
        System.out.println("Deleted element is: "+ s.remove());
        System.out.println("Deleted element is: "+ s.remove());
    }
}
