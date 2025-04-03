package ObjectCloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human sudhakar = new Human(48, "Addagiri Koti Sudhakar");
        // Human ganesh = new Human(sudhakar);
        // Easiest way to implement the clone functionality
        Human ganesh = (Human)sudhakar.clone();

        System.out.println(ganesh.age+" "+ganesh.name);

        // To print tha arrays defined in the before class
        System.out.println(Arrays.toString(ganesh.arr)); // [3, 4, 5, 6, 9, 1]
        ganesh.arr[1] = 100;
        // Here we changed array value of ganesh object
        // But here sudhakar value of array, 1st indexed location is changed to 100 so it is called Shallow Copying.
        
        // Shallow Copying: primitives will be copied as it is, but if you are
        // creating objects that conatain other object type, that object type value willn't be copied.
        // Internally refernce variable points to the same object. 
        System.out.println(Arrays.toString(ganesh.arr));
        System.out.println(Arrays.toString(sudhakar.arr)); // [3, 100, 5, 6, 9, 1]
 
    }
    
}
