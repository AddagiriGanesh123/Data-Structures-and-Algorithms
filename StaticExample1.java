public class StaticExample1 {
    static int a=5;
    static int b;

    // Static block is used to create for only once and utilise it for only once
    static{

        // we can access here the static variables in this block
        System.out.println("I am in static block");
        b=a*5;
    }
     public static void main(String[] args) {
        //StaticExample1 obj = new StaticExample1();
        System.out.println("value of a : " +StaticExample1.a + " " + "value of b: "+ StaticExample1.b  );


        StaticExample1.b+=3;
        System.out.println("value of a : " +StaticExample1.a + " " + "value of b: "+ StaticExample1.b  );
        
        // Here loop won't run because of static block
        StaticExample1 obj2 = new StaticExample1();
        System.out.println("value of a : " +StaticExample1.a + " " + "value of b: "+ StaticExample1.b  );

     }
}
