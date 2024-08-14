package LinkList;

public class LL {

    Node head;  //refering first node in the LL
    Node tail;  //refering last node in the LL


    //Method for adding into the list

    public void addToList(int data){
        Node newNode = new Node(data);
        // check for list is empty or not 
        if (head == null) {
            head = newNode;
        }
        else{
            //do not what to change the head 
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            
        }
    }

    //Method for displaying node from list

    public void display(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("End");
    }

    class Node {
        int data;
        Node next;

        Node (int data) {
            this.data = data;
        }
    } 
}
