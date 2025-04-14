public class NewtonRaphsonMethod {
    public static void main(String[] args) {
        double n = 36;
        double root;
        double x  = n;
        while (true) {
            root = 0.5 * (x+(n/x));
            if(Math.abs(root - x) < 0.31213){
                break;
            }
            x = root;
        }
        System.out.println(root);
    }
}
