package CollectionFramework;

public class Linklist {
    
    Node head;  //pointing to the first node in the list...........
    Node tail;  //pointing to the last node in the list.......


    class Node {
        int data;
        Node next;

        public Node(int data){
            this.data = data;
        }
    }
    //isEmpty()
    public boolean isEmpty(){
        return head == null;
    }

    //insert()
    public void insert (int data) {
        Node N = new Node(data);
        if (isEmpty()) {
            head = N;
        }
        else{
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = N;
        }
    }

    //want to add the element at first of linklist 
    public void addAtFirst(int data){
        Node newNode = new Node(data);
        //first i will check that list is empty or not
       newNode.next = head;
       head = newNode;
    }

    //Dispay the added nodes
    public void displayNodes () {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.print("null");
    }
}
