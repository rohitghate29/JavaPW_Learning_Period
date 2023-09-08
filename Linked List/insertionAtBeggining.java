public class insertionAtBeggining {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    // implementation of insertion of a node at the end 
    public void insertAtEnd(int newData) {
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

    public void insertAtBeg(int newData){
        Node newNode = new Node(newData);
        newNode.next = head;        
        head = newNode;
        
    }

    // display all nodes after the insertion
    public void printNodes() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    public static void main(String[] args) {
        insertionAtBeggining list = new insertionAtBeggining();

        // Function calling
        list.insertAtEnd(2);
        list.insertAtEnd(4);
        list.insertAtEnd(8);
        list.insertAtEnd(10);

        list.insertAtBeg(1);
        list.printNodes();
        System.out.println();

        
    }
}
