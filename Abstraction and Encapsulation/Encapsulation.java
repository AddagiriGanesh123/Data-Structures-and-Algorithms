package EnacapsulationAndAbstraction;
public class Encapsulation {
    // Declared as public due to get its accessed everywhere
    //public int age;
    // private int age;
    protected int age;
    // For private it's getting error 
    // According to java it doesn't allow to access private variable from outside the class
     

    public Encapsulation(int age){
        // Constructor of the class
        // this is used to reference of the current object

        this.age = age;
    }
    // Here it is defined with in the same class and it's variables got accessed by 
    // public access modifier
        // public static void main(String[] args) {
    //     Encapsulation encapsulation = new Encapsulation(5);
    //     System.out.println(encapsulation.age);
    // }
}
