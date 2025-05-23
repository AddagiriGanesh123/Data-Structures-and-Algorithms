package ExceptionHandling;

public class StringIndexOutOfBoundsExceptionOverview {
    public static void main(String[] args) {
        String s = "Hyderabad";
        int n = s.length();
        System.out.println(n);
        System.out.println(s.substring(0, 4));
        System.out.println(s.substring(0, 30));

        // Exception raises likes this:-

        // Exception in thread "main" java.lang.StringIndexOutOfBoundsException: begin 0, end 30, length 9
        // at java.base/java.lang.String.checkBoundsBeginEnd(String.java:4606)
        // at java.base/java.lang.String.substring(String.java:2709)
        // at ExceptionHandling.Stringover.main(Stringover.java:9)
    }
}
