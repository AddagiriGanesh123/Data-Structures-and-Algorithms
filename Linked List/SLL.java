package LinkedListOverview;

public class SLL {
    private Node head;
    private Node tail;
    private int size;
    public SLL(){
        this.size = 0;
    }
    private class Node{
        private int val;
        private Node next;

        public Node(int val){
            this.val = val;
        }

        public Node(int val,Node next){
            this.val = val;
            this.next = next;
        }
    }

    // Insertion at first index
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        if(tail == null){
            tail = head;
        }
        size++;
    }
    // Display
    public void display(){
        Node node = head;
        while(node != null){
            System.out.print(node.val+"->");
            node = node.next;
        }
        System.out.println("END");
    }

    // Insewrtion at last
    public void lastInsert(int val){
        Node node = new Node(val);
        if(tail == null){
            insertFirst(val);
            return;
        }
        tail.next = node;
        tail = node;
       // tail.next = null;
        size++;
    }

    public void insert(int val, int index){
        if(index == 0){
             insertFirst(val);
             return;
        }
        if(index == size){
            lastInsert(val);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp .next;
        }

        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }

    public int deleteFirst(){
        int val = head.val;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
        return val;
    }
    public Node get(int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public int deleteLast(){
        int val = tail.val;
        if(size <= 1){
            return deleteLast();
        }
        Node secLast = get(size - 2);
        tail = secLast;
        tail.next = null;
        size--;
        return val;
    }

    public int delete(int index){
        if(index == 0){
           return deleteFirst();
        }
        if(index == size){
            return deleteLast();
        }

        Node prev = get(index - 1);
        int val = prev.next.val;
        prev.next = prev.next.next;
        size--;
        return val;
    }
}
class SLLMain {
    public static void main(String[] args) {
        SLL list = new SLL();
        list.insertFirst(6);
        list.insertFirst(5);
        list.insertFirst(4);
        list.display();
        list.lastInsert(7);
        list.display();
        list.insert(9, 2);
        list.display();
        list.deleteFirst();
        list.display();
        list.deleteLast();
        list.display();
        list.delete(2);
        list.display();
    }
}

