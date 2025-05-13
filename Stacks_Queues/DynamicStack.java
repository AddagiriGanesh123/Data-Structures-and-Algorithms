package StackConcepts;

public class DynamicStack extends StackProgresssion{
    
    public DynamicStack(){
        super(); // this is the constructor which is used to call the method without written in the parent class
        // here we are calling the constructor of the parent class without defining the size
    }

    public DynamicStack(int size){
        super(size);
        // it will call StackProgression(int size) which is the base class here though...
    }

    // In dynamic stack and custom staxk the only difference is the size of the stack is not fixed
    // it can be increased or decreased dynamically
    // If the stack is full then double of allocation of mermory is to be done in the dynamic stack
    

    // In Dynamic Stack:- the operations like push and peek would be same, the only difference is in the implementation of the pop andsearch operation
    // Here we need to check the size of the stack 
    // Otherwise Double it.

    // directly is not poosible
    // It is achieved here though method over-riding
    
    public boolean push(int item) {
         // this takes care of being full

         if(this.isFull()){
            // consider a temp to double the size of the stack
            int[] temp = new int[data.length * 2];
            // copy the data from the old array to the new array
            System.arraycopy(data, 0, temp, 0, data.length);
//Note:
//             System.arraycopy(
//     FROM_ARRAY,      // Source array
//     FROM_INDEX,      // Start index in the source array
//     TO_ARRAY,        // Target array
//     TO_INDEX,        // Start index in the target array
//     NUMBER_OF_ITEMS  // How many elements to copy
// );

            // update the data array to the new array
            data = temp;
        }
        return super.push(item);
    }
     public int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack is empty");
        }
        return data[ptr--];
    }
    public int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack is Empty");
        }
        return data[ptr];
     }
}
