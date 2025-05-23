
package ExceptionHandling;

public class Program1 {
  // Exception: An exception is an event that occurs during the execution of a program,
  // that disrupts the normal flow of the program’s instructions.

  // Error: An error is an event that occurs during the execution of a program,
  // that disrupts the normal flow of the program’s instructions.

  // Error Vs Exception: The main difference between error and exception is that error is a syntax error
  // that occurs at compile time, whereas exception is a runtime error that occurs at runtime.
    public static void main(String[] args) {
       System.out.println("Program Started");
      int a  = 10;
      System.out.println(a);
      int b = 0;
      System.out.println(b);
      int c  = a/b;
      System.out.println(c);
      System.out.println("Program Stopped!");
    }
}
