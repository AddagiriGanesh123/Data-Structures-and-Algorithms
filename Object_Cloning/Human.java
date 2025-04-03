package ObjectCloning;
// Human Cloning: It defines copying of one object to another object in a specific code.
public class Human implements Cloneable{
    int age;
    String name;
    // For Shallow copy we are creating an array
    int[] arr;
    // Generate Constructor
    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr = new int[]{3,4,5,6,9,1};
    }
    // // Copying the values of one object to another using other variable instance 
    // public Human(Human other){
    //     this.age = other.age;
    //     this.name = other.name;
    // }
    // Simple way to creating clone of an object
    // Default method to speedify the process
    @Override
    // here Object is over-ridden.
    // public Object clone() throws CloneNotSupportedException{
    //     // This is Shallow Copy
    //     return super.clone();
    // }

    public Object clone() throws CloneNotSupportedException{
        // This is Deep Copy:
        // If we change the value of arr[1] in ganesh object it doesn't leads to change in Sudhakar object .
        // It is called deep copying and doesn't effective for other objects to copy the values.
        // Human ganesh = (Human)super.clone(); // Actually this is Shallow copying
        
        // So for this make a Deep Copy
        // Means the values of Sudhakar doesn't changes but the values of ganesh changes due to Deep Cloning.
        ganesh.arr = new int[ganesh.arr.length];
        for (int i = 0; i < arr.length; i++) {
            ganesh.arr[i] = this.arr[i];
        }
        return ganesh;
    }
}
