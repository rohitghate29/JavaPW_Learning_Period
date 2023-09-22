import java.util.Stack;

public class queueUsingStack {

    static Stack<Integer> stack1 = new Stack<>();
    static Stack<Integer> stack2 = new Stack<>();

    //insertion of data in the queue
    static void enQueue(int data){
        stack1.push(data);
    }  

    //deletion of the data from the queue
    static int deQueue(){
        int ele;
        if(stack1.empty() && stack2.empty()){
            System.out.println("Queue is empty.");
            System.exit(0);
        }

        //pushing all the elements from stack1 to stack2
        if(stack2.empty()){
            while(!stack1.empty()){
                ele = stack1.pop();
                stack2.push(ele);
            }
        }

        //pop the top element from stack2
        ele = stack2.pop();
        return ele;
    }

    public static void main(String[] args) {
        queueUsingStack q = new queueUsingStack();

        // function calling for insertion in queue
        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);
        q.enQueue(4);

        System.out.println(q);

        // function calling for deletion of an element in queue
        System.out.println("Deleted element is: "+ q.deQueue());
        // q.deQueue();
    }
}
