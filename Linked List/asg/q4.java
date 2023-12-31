// Q4. Given the head of a singly linked list, return true if it is a palindrome or false otherwise.
// Example 1:
// input: head = [1,2,2,1]
// Output: true
// Example 2:
// input: head = [1,2]
// Output: false

package asg;

public class q4 {
    Node head;

    class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }
    }

    public void endInsert(int data){
        Node newNode = new Node(data);
        newNode.next = null;
        Node temp = head;
        // linked list is empty
        if (head == null) {
            head = new Node(data);
            return;
        }

        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        return;
    }

    public void checkPalindrome(){
        
    }

    public void display(){
        Node curr = head;
        while(curr !=null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }
    public static void main(String[] args) {
        q4 ll = new q4();
        ll.endInsert(1);
        ll.endInsert(2);
        ll.endInsert(2);
        ll.endInsert(1);
        ll.display();

    }
}
