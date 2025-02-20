public class FinalKeyword {
    public static void main(String[] args) {
        // final int bonus=2;
        // bonus=3;
        //Final is used whebn the another value is to be can't initialised with the single reference variable

        //Here it gives error because once final is initialised to primitve data type it won't changes..
        final A class1=new A("Soul");
        System.out.println(class1.name);
        //class1=new A("Soul2"); it gives error because once final is assigned to object it won't change 
        //for non-primitive data types
        
        //Garbage Collector: Here loop runs from 1 to no. of times 
        //Then only the reference variable is pointed to single object at once
        //Here the thing is to be noted that the previous for loop with < last move should be deleted by
        //means of garbage collector using finalize keyword like Destructor in C/C++..
        A obj;
        for (int i = 0; i < 10000000; i++) {
            obj=new A("Random Name");
        }
    }
}
class A {
    int x=35;
    String name;
    A(String name){
        //System.out.println("Object Created");
        this.name=name;
    }
    
    @Override
    protected void finalize() throws Throwable {
       //Finalise is just like destructor used to for the garbage Collection to remove the spaces of mmemory in heap
        System.out.println("Object is destroyed!");
    }
}
