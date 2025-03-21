package EnacapsulationAndAbstraction;

public class Main {
    public static void main(String[] args) {
        // public access for the same package with the class
        Encapsulation encapsulation = new Encapsulation(5);
        // It usually gives the output even though it is defined with protected access modifier
        // Like this:
        // protected int age;
        System.out.println(encapsulation.age);
        

        // public access for the same package with the sub-class which is defined in the same package
        SubClass subclass = new SubClass(2128,4576);
        System.out.println(subclass.weight+" "+subclass.age);
    }
    
}
