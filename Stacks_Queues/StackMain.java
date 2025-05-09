//package Stacks_Queues;

public class StackMain {
    public static void main(String[] args) throws StackException {
        CustomStack stack = new CustomStack(5);
        stack.push(1);
        stack.push(2);
        stack.push(4);
        stack.push(5);

        System.out.println(stack.pop()); // returns 5; which is lastly inserted to be deleted first
        System.out.println(stack.pop()); 
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }
}
