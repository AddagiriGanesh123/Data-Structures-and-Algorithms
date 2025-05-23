package ExceptionHandling;

public class NullPointerExceptionOverview {
    String name = "ganesh";
    int age = 21;
    public static void main(String[] args) {
        NullPointerExceptionOverview obj = new NullPointerExceptionOverview();
       //  System.out.println(obj.name+"\n"+obj.age);

        obj = null;
        // If the object reference is null, then it will throw NullPointerException
        System.out.println(obj.age);
        // Exception in thread "main" java.lang.NullPointerException: Cannot read field "age" because "obj" is null
        // at ExceptionHandling.NullPointerExceptionOverview.main(NullPointerExceptionOverview.java:11)
    }
}
