package Stacks_Queues;

import java.io.EOFException;
import java.util.Stack;

public class CustomStack {

    // Stack throws an EmptyStackException when we try to pop elements from an empty stack which is called as Underflow Situation
    // Overflow is a situation where we are pushing the elements in the fully filled
    protected int[] data;
    // Intenarlly it has an array inside it, alike linked list had node, next, head & tail
    // Consider it as not a Dynamic Stack, particularly it has some fixed length
    private static final int Default_Size = 10;
    // Static beacuse Default_Size of all objects of the stack is 10 not changable so it is static
    // Private means Default_Size = 10 is don't wont to change directly and here due to final
    
    
    // If we dont have to call the default size then call the constructor of default size with out giving any values as paarameter
    public CustomStack(){
        this(Default_Size); // Automatically assigns the size here.......
    }
     
    // Initially elements of an aray are having default value is 0.
    // Then consider the pointer at index -1 and insert  the element and then increment the pointere by 1
    // Means if we want to add 18 at index 0 and them 35 at index 1 then after adding at index 1 then pointer increases
    

    // For having the  default size:
    public CustomStack(int size) {
        this.data = new int[size];
        // pass new int size of an array to the data in the array stored in heao which is referred through stacks using new keyword

    }

    // Initialise the pointer
    int ptr = -1;
    // Push operation is done by incrementing the pointer and storing the element at the pointer position
    public boolean push(int item){

        // Let's check the size of the array is full or not!
        if(isFull()){
            System.out.println("Array is Full");
            return false;
        }
        ptr++;
        data[ptr]  = item;
        return true;
    }
    
    // creating a function for isFull() to consder whether the array is filled or not for overflow exception
    public boolean isFull(){
        // return the condition when the array pointer is at the last index of the array
        return ptr == data.length-1;
    }

    // also check for the condition when the array is empty
    public boolean isEmpty(){
        return ptr == -1; // whenever it is empty by means that the ptr is at -1 indexed position
    }

    // Pop operation is done by decrementing the pointer and returning the element at the pointer position
     public int pop() throws StackException{
        // StackException is the exception which is thrown when the stack is empty by the reference of Eception extends from the super class

        // Let's check the size of the array is empty or not!
        if(isEmpty()){
            throw new StackException("Cannot pop from an empty stack!, leads to the Overflow Exception");
        }
        // Here we supposed to return the element at the pointer position
        // int removed = data[ptr];
        // ptr--;
        // return removed;

        // In simple terms we will return like this
        return data[ptr--];
     }
     
     // Also find the peek element in the stack which is at the top of the stack
     public int peek() throws Exception{
        // Let's check the size of the array is empty or not!
        if(isEmpty()){
            throw new Exception("Cannot peek from the empty stack!, leads to the Overflow Exception");
        }
        return data[ptr];
        // Pointer ptr, actually points to the top of the stack at the stage of peek operation
     }
}