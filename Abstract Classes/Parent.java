package Abstraction;

public abstract class Parent {
    int age;
    
    // public Parent(int age) {
    //     this.age = age;
    // }
    // IT WONT WORKS
    // we can't create objects of abstract class due tri incomplete nature and design principles
    // Simlilarly we can't create abstraact constructors

    // We can create static methods in Abstract Classes
    // Still Multiple Inheritence is can't achieved through Abstract Classes 
    // We need to use Interfaces for the abstract classes
    // Inerface is just like a class but not fully, it contains abstract methods and static variables with final values consideration

    // Abstract can provide the implementation of the interfaces
    // But Interfaces can't provide the implementation of the abstract classes
    // Interfaces uses the implements keyword and abstract classes use the extends keyword
    // A class can implements more than one interfaces 
    // But while on other hand a class can extend only a super class

    static void hello(){
        System.out.println("Hey, Hi EveryOne");
    }

    // Abstract classes can also contain normal methods
     void greeting(){
        System.out.println("Good Morning!");
    }

    // final int value;

    // public Parent(int age) {
    //     this.age = age;
    //     //this.value = value;
    //     value = 2344656;
    // }

    abstract void career();
    // For abstract classes no curly braces and Statement of code/Block code
    abstract void partner();
    // Abstract classes cannot be Final because they wanted to be inherited

}
