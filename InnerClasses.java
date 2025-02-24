public class InnerClasses {
 
    //static public class InnerClasses {// Error 
    // Outside classes cannot be static
    // only inner classes can be static 
    // Class inside a class is also possible..
    // class Test { also gives error without static
    // Without creating static here it will give error due to the Test class should be dependent on the outer class
    // Called InnerClasses 
    static class Test {
        String name;
        Test(String name){
            this.name=name;
        }

        // Overriding:
        
        // @Override
        // public String toString() {
        //     return name;
        // }
         
    }

    public static void main(String[] args) {
        Test t= new Test(" Kunal Kushwaha");
        Test t1= new Test(" Rahul Behara");
         System.out.println(t.name);
         System.out.println(t1.name);
    }
    static class Test11 {
        String name;
        Test11(String name){
            this.name=name;
        }
         
    }
}
