package LinkedListOverview;
public class CLL {
    // Circular Linked list means that linked list is in a chain
    private Node head;
    private Node tail;
    public CLL(){
        this.head = null;
        this.tail = null;
    }
    private class Node{
        private int val;
        private Node next;
        public Node(int val){
            this.val = val;
        }
    }
    // Insertion of elements in linked list
    public void insert(int val){
        Node node = new Node(val);
        if(head == null){
            head = node;
            tail = node;
        }
        tail.next = node;
        tail = node;
        node.next = head;
    }
    // Display the elements using Do -While loop
    public void display(){
        Node node = head;;
        if(head != null){
            do{
                System.out.print(node.val+"->");
                node = node.next;
            }while(node != head);
        }
        System.out.println("HEAD");
    }

    // Deletion of Elements in the Circular Linked list
    public void delete(int val){
            Node node = head;
            if(node == null){
                return;
            }
            if(node.val == val){
                head = head.next;
                tail.next = head;
            }

            // Otherwise Using Do-While loop consideration:
            do{
            Node n = node.next;
            if(n.val == val){
                node.next = n.next;
                break;
            }
            node = node.next;
        }while(node != head);
    }
}

class CLLMain {
    public static void main(String[] args) {
        CLL list = new CLL();
        list.insert(8);
        list.insert(7);
        list.insert(6);
        list.insert(5);
        list.insert(4);
        list.display();
        list.delete(4);
        list.display();
    }
}
