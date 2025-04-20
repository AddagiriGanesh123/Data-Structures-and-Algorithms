package BItManipulation;

public class Even_Odd {
    public static void main(String[] args) {
        int n = 68;
        if(checkOdd(n) == 1){
            System.out.println(n + " is an odd number");
        }else{
            System.out.println(n + " is an Even Number");
        }
    }
    static int checkOdd(int n){
        return (n & 1);
    }
}
