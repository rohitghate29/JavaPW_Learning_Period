public class delete {
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

    // implementation of insertion of a node at the beginning 
    public void insertAtBeg(int newData){
        Node newNode = new Node(newData);
        newNode.next = head;        
        head = newNode;
    }

    // implementation of insertion of a node at anywhere in the Linked list 
    public void insertAtAny(Node prev_node, int newData){
        if(prev_node == null){
            System.out.println("The Previous node can not contain null values.");
            return;
        }

        Node newNode = new Node(newData);
        newNode.next = prev_node.next;
        prev_node.next = newNode;
    }

    // implementation of deletion of a node from the Linked list 
    void deletNode(int position){
        //if linkedList is empty
        if(head == null){
            return;
        }

        Node temp = head;
        //deletion from the beginning
        if(position == 0){
            head = temp.next;
            return;
        }

        //deletion apart from beginning
        for(int i=0; temp != null && i<position-1;i++){
            temp = temp.next;
        }

        if(temp == null && temp.next == null){
            return;
        }

        temp.next = temp.next.next;
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
        delete list = new delete();        

        // Function calling
        list.insertAtEnd(2);
        list.insertAtEnd(4);
        list.insertAtEnd(8);
        list.insertAtEnd(10);

        list.insertAtBeg(1);
        list.printNodes();
        System.out.println();
        list.insertAtAny(list.head.next.next, 13);
        list.printNodes();

        list.deletNode(2);
        System.out.println("Given node deleted");
        list.printNodes();
    }
}
