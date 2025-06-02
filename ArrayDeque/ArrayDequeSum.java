package Codegnan_Dialy_Test;

import java.util.ArrayDeque;
import java.util.Scanner;

public class ArrayDequeSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayDeque<Integer>deque = new ArrayDeque<>();
        System.out.println("Enter no. of elements in ArrayDeque:");
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            deque.add(in.nextInt());
        }
        int sum = 0;
        for (Integer integer : deque) {
            sum += integer;
        }
        System.out.println(sum);
    }
    
}
