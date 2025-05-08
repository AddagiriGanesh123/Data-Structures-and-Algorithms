package Stacks_Queues;

import java.util.Stack;

public class StackImplementation {
    public static void main(String[] args) {
        // Stack is a class, used to follows the LIFO and FILO principle
        // But unlike array, it does not have a fixed size
        // Queue is an interace it does not has new method of built-in to access the mechanism
        Stack<Integer> stack= new Stack<>();
        stack.push(5);
        stack.push(6);
        stack.push(9);

        // To get items from the stack we use pop method
        System.out.println(stack.pop()+" "+ stack.pop()); // 9 6
        // This above built-in method enhances to return the top of the stack which is inserted at last is to be deleted first
        System.out.println(stack.pop()); // 5
        // System.out.println(stack.pop());
      
        
    }
}
