package Generics;
// Generics is a concept where we can create classes, Interfaces and methods and it is compatible with various data types
public class Main {
    public static void main(String[] args) {
        // Box<Integer> box = new Box<>();
        // box.setItem(1201);
        // System.out.println(box.getItem());
        // Box<Double>box = new Box<>();
        // box.setItem(12000d);
        // System.out.println(box.getItem());

        Product<String,Double> product = new Product<String,Double>("Ganesh",1201d);
        System.out.println(product.getItem());
        System.out.println(product.getPrice());

    }
}
