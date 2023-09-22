package asg;

import java.util.LinkedList;

public class q3 {

    Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    //insert at beginning
    public void begInsert(int data){
        Node newData = new Node(data);
        newData.next = head;
        head = newData;
    }

    //insert at end
    public void endInsert(int data){
        Node newNode = new Node(data);
        // linked list is empty
        if (head == null) {
            head = new Node(data);
            return;
        }

        newNode.next = null;
        Node temp = head;
        
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        return;
    }

    public void removeDuplicate(){
        if(head == null){
            return;
        }

        Node curr = head;
        while(curr != null){
            Node temp = curr;
            while(temp.next != null){
                if(temp.next.data == curr.data){
                    temp.next = temp.next.next;
                }
                else {
                    temp = temp.next;
                }
            }
            curr = curr.next;
        }

    }

    public void display(){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }

        
    }
    public static void main(String[] args) {
        q3 ll = new q3();

        // ll.begInsert(1);
        ll.endInsert(1);
        ll.endInsert(2);
        ll.display();
        System.out.println();
        ll.removeDuplicate();
        ll.display();
    }
}
