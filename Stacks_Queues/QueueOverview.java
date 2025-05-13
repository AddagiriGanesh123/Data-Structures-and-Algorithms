// package StackConcepts;

public class QueueOverview {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    public QueueOverview() {
        this(DEFAULT_SIZE);
    }
    public QueueOverview(int size) {
        this.data = new int[size];
    }
    
    int end = 0;
    public boolean isEmpty(){
        return end == 0;
    }

    public boolean isFull(){
        return end == data.length;
    }

    // insertion
    public boolean insert(int item){
        if(isFull()){
            return false;
        }

        data[end++] = item;
        return true;
    }

    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is Empty!");
        }
        int removed = data[0];
        for (int i = 1; i < data.length; i++) {
            data[i-1] = data[i];
        }
        return removed;
    }
    
    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty!");
        }
        return data[0];
    }

    public void display(){
    for (int i = 0; i < end; i++) {
        System.out.print(data[i] + " <- ");
    }
    System.out.println("End");
   }
   public static void main(String[] args) throws Exception {
        QueueOverview queue = new QueueOverview();
        System.out.println();
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        queue.insert(4);
        queue.insert(5);
        System.out.println();
        queue.display();

        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println();

         queue.display();
    }
}
