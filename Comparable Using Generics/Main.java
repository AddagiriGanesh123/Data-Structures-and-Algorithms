package GenericComparator;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student kunal = new Student (99, 89f);
        Student rahul = new Student(87, 78f);
        Student teja = new Student(98,84.3f);

        Student[] list = {kunal,rahul,teja};
        System.out.println(Arrays.toString(list));
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));

        if(kunal.compareTo(rahul)>0){
            System.out.println("Kunal secured more marks than rahul");
            System.out.println(kunal.compareTo(rahul));

            // if 
        }
    }
    
}
