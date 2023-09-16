// Q1. Given a linked list and a key ‘X‘ in, the task is to check if X is present in the linked list or not.
// Examples:
// input: 14->21->11->30->10, X = 14
// output: Yes
// Explanation: 14 is present in the linked list.
// Input: 6->21->17->30->10->8, X = 13
// Output: No

package asg;

import java.util.LinkedList;

public class q1 {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    // implementation of insertion of a node at the beginning 
    public void insertAtBeg(int newData){
        Node newNode = new Node(newData);
        newNode.next = head;        
        head = newNode;
    }

    //check whether the given element is present or not
    public boolean checkElem(Node head, int x){
        Node curr = head;
        while(curr != null){
            if(curr.data == x){
                return true; // data found
            }
            curr = curr.next;
        }
        return false; // not found
    }

    public static void main(String[] args) {
        q1 ll = new q1();
        ll.insertAtBeg(14);
        ll.insertAtBeg(21);
        ll.insertAtBeg(11);
        ll.insertAtBeg(30);
        ll.insertAtBeg(10);

        if(ll.checkElem(ll.head, 21))
        System.out.println("Yes");
        else
        System.out.println("No");
    }
}