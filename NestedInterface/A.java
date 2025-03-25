package NestedInterface;

public class A {
    // nested interface
    public interface NestedInterface{
        public boolean isOdd(int n);
    }
}
class B implements A.NestedInterface{
    public boolean isOdd(int n){
        return (n%2)!=0;
    }
}
class Main {
    public static void main(String[] args) {
        B object = new B();
        System.out.println(object.isOdd(5));
        // 5%2 == 1
        // So 5 is an Odd Number
    }
}
