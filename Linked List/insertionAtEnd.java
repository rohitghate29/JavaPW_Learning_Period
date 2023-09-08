import java.util.LinkedList;

import org.w3c.dom.Node;

public class insertionAtEnd {
    Node head;

        class Node{
            int data;
            Node next;

            Node(int d){
                data = d;
                next = null;
            }
        }

         //insert node at the very end of the linked list
        public void insertAtEnd(int newData){
            // intialize the newNode with the newData entered by the user
            Node newNode = new Node(newData);

            //linked list is empty
            if(head == null){
                head = new Node(newData);
                return;
            }

            //linked list is not empty
            newNode.next = null;
            //traversing the linked list at the end of the node
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }

            temp.next = newNode;
            return;
        }

        //display all nodes after the insertion 
        public void printNodes(){
            Node current = head;
            while(current != null){
                System.out.print(current.data+" ");
                current = current.next;
            }
        }

    public static void main(String[] args) {
        insertionAtEnd llist = new insertionAtEnd();

        //Function calling
        llist.insertAtEnd(2);
        llist.insertAtEnd(4);
        llist.insertAtEnd(8);
        llist.insertAtEnd(10);
        llist.insertAtEnd(15);

        System.out.println("Linked List after successful insertion of all the nodes:  ");
        llist.printNodes();
        System.out.println();

        llist.insertAtEnd(18);
        llist.printNodes();
        System.out.println();
    }
}