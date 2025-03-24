package Abstraction;

public class Main {
    public static void main(String[] args) {

        // If we keep abstract subclasses for extending from Super class 
        // Like Example :
        // public abstract Son extends Parent{}
        // For this type of existence we unable to instiate the son class because of its abstract nature
        // Abstarct classes means we can't create object of that class
        // Here abstract classes provide the over-ridden method which is already defined in the super class
        // Then the Child class must have implement the nature in the sub-class
        // Real-Time Example:
        // Parent sents you to School, then it's upto the Student either has to read or not
          
       Daughter daughter = new Daughter(47);
       System.out.println(daughter.age);
       daughter.career();

       Son son = new Son(48);
       System.out.println(son.age);
       son.partner();

       Parent.hello();

       // Normal Methods for Abtract Class
       son.greeting(); 
       //Parent.greeting();

    }
    
}
