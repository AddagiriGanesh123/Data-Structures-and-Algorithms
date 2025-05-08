package Stacks_Queues;

import java.util.LinkedList;
import java.util.Queue;

public class QueuesImplementation {
    public static void main(String[] args) {
        // Queue<Integer> queue = new Queue<Integer>() {
            
        // }; 
        // It's geting error because Queue is an interface in Java and we can't create object of interface directly.
        // It consists of abstract methods which are declared but not defined.
        // We can create object of class which implements Queue interface. by means of LinkedList
        // Queue is just like a representation of Linked List 
        // Where we can add elements at the end and remove elements from fast
        // Unlike stack where we can add and remove elements from both ends
        // In stack insertion and deletion done at same end

        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(4);
        queue.add(3);
        queue.add(47);

        // For retrieving the elements of the Queue , we use the peek() method
        // It returns the head of the Queue without removing it from the Queue
        // means It does not deletes the element in the list i.e., Queue..
        
        System.out.println(queue.peek()); // returns the head of the Queue
        System.out.println(queue.remove()); // 1 is removed from the Queue
        System.out.println(queue); // [4, 3, 47] is the output

    }
    
}
