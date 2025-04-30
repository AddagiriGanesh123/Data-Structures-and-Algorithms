package LinkedListOverview;
// Double Linked List:
// The only difference between the Single Linked List and Doubler Linked List is that 
// In the Single lined list we can't traverse it back
// But in the double linked list we can traverse it back
// It usually resembles as like the Single linked list it also totally consists of Head, Tail
public class DLL {
    private Node head;
    private Node tail;

    private class Node{
        private int val;
        private Node next;
        private Node prev;
        // create a constructor to define the val and next reference variable in the code 
        public Node(int val){
            this.val = val;
        }
        // Create a constructor to define the val and next reference value
        public Node(int val, Node next){
            this.val = val;
            this.next = next;
        }
    }

    // Insert the first value in the list
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head != null){
            head.prev = node;
        }
        head = node;
    }

    // Display
    public void display(){
        Node node = head;
        Node last = null;
        while(node != null){
            System.out.print(node.val+"->");
            last = node;
            node = node.next;
        }
        System.out.println("END");
        System.out.println("Traverse in Reverse order is:");
        while(last!=null){
            System.out.print(last.val+"->");
            last = last.prev;
        }
        System.out.println("START");
    }

    // Insertion at last position
    public void insertLast(int val){
        Node node = new Node(val);
        Node last = head;
        if(head == null){
            node.prev = null;
            head = node;
        }
        while (last.next != null) {
            last = last.next;
        }
        last.next = node;
        node.next = null;
        node.prev= last;
    }

    // Find the node then return that node
    public Node find(int value){
        Node node = head;
        while(node != null){
            if(node.val == value){
                return node;
            }
            node = node.next;
        }
        return null;
    }

    // insert the value in the doubly linked linked list at any index
    public void insert(int after, int val) {
        // Here after means after which value we are going to add the element in the doubly linked list
        // Also define previous node as p here
        Node p = find(after);
        // It means if p do not has any value then it doesn't understands how to add element & where to add element
        if(p == null){
            System.out.println("Does not exists in the Doubly linked list");
            return;
        }

        // Create a new box to define the value as element to be added anywhere in the doubly linked list
        Node node = new Node(val);
        node.next = p.next;
        p.next = node;
        node.prev = p;
        // Null-Pointer Exception
        if(node.next != null){
            node.next.prev = node;
        }
    }
}
class DLLMain {
    public static void main(String[] args) {
        DLL list = new DLL();
        list.insertFirst(5);
        list.insertFirst(4);
        list.insertFirst(3);
        list.display();
        list.insertLast(2);
        list.display();
        list.insert(3, 18);
        list.display();
    }
}
 
