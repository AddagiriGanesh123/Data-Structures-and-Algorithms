package JavaOops;
public class Student1{
    // int x;
    public Student1(){
        this(5);
        System.out.println("1st constructor");
    }
    public Student1(int x){
        this(5, 15);
        System.out.println("2nd constructor");
    }
    Student1(int x, int y){
        System.out.println(x * y);
    }
    public static void main(String[] args) {
        Student1 obj = new Student1(5,6); // 30
    }
}