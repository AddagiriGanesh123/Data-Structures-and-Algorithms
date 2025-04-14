public class GCD_LCM {
    public static void main(String[] args) {
        System.out.println(gcd(9, 18));
        System.out.println(lcm(9,18));
    }
    // Method to find the Greatest Common Divisor-> HCF
    public static int gcd(int a, int b){
        if(a == 0){
            return b;
        }
        return gcd(b % a, a);
    }
    // To find LCM
    // We know LCM = a * b / GCD
    // i.e., LCM(9, 18) = 9 * 18 /9 = 162 / 9 = 18
    public static int lcm(int a, int b){
        return (a * b) / gcd(a, b);
    }
}
