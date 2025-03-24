package Abstraction;
// Abstarction means hiding the internsl implementation details and interfaces the essentisl stuff which is required.
public class Son extends Parent {
    //@Override 
    // Here overridden because the method method is alresdy implemented in super class and 
    // we are defining in the child class having its own Candidature
    // Method Over-Riding: When a method is defined in the sub class which is already defined in the super class
    // Then also having the same name, same return type and same parameters then it is called method over riding(Candidature)
    public Son(int age){
        this.age = age;
    }
    @Override
    void greeting(){
        super.greeting();
    }
    
    void career(){
        System.out.println("I want to become a Doctor");
    }
    //@Override
    void partner(){
        System.out.println("I want to marry a doctor");
    }
}
