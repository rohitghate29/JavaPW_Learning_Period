import java.util.Stack;

public class implementationOfStack {
    public static void main(String[] args) {
        
        Stack<Integer> stack1 = new Stack<>();
        stack1.push(2);
        stack1.push(4);
        stack1.push(6);
        stack1.push(5);
        stack1.push(7);
        stack1.push(8);

        // deleting top element 
        System.out.println("Top Most element in the stack before deleting is: "+ stack1.peek());
        stack1.pop();
        //Top most element
        System.out.println("Top Most element in the stack after deleting is: "+ stack1.peek());

        //search()
        System.out.println("Element 6 is present at position: "+ stack1.search(6));

        //empty()
        System.out.println("Is the stack is empty or not: "+ stack1.empty());
    }
}