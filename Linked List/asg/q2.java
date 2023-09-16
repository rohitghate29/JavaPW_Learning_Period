// Q2. Insert a node at the given position in a linked list. We are given a pointer to a node, and the
// new node is inserted after the given node.

// Input : LL = 1 -> 2 -> 4 -> 5 -> 6 pointer = 2 value = 3.
// Output : 1 -> 2 -> 3 -> 4 -> 5 -> 6

package asg;

public class q2 {
    Node head;
    class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }
    }

    //Insert at endinning
    public void end(int newData){
        Node newNode = new Node(newData);
        // linked list is empty
        if (head == null) {
            head = new Node(newData);
            return;
        }
        // linked list is not empty
        newNode.next = null;
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        return;
    }

    //insert anywhere
    public void insertAnywhere(Node prev, int newData){
        if(prev == null){
            System.out.println("The Previous node can not contain null values.");
            return;
        }
        Node newNode = new Node(newData);
        newNode.next = prev.next;
        prev.next = newNode;
    }

    public void displayList(){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }
    public static void main(String[] args) {
        q2 list = new q2();
        list.end(1);
        list.end(2);
        list.end(4);
        list.end(5);
        list.end(6);
        list.displayList();
        System.out.println();

        list.insertAnywhere(list.head.next, 3);
        list.displayList();
    }
}




