package LinkList;

public class LL {

    Node head;  //reference variable pointing to the fist node in the link list
    Node tail;  //reference variable pointing to the last node in the link list
    

    //method to add element at first in link list  //addFirst
    public void addFirst (int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    

    class Node {
        int data;
        Node next;

        public Node (int data) {
            this.data = data;
            this.next = null;
        }
    }




}
