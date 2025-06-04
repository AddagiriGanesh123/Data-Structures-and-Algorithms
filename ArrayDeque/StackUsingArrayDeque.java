package Codegnan_Dialy_Test;

import java.util.ArrayDeque;
import java.util.Scanner;

public class StackUsingArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer>stack = new ArrayDeque<>();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter No. of elements to be in Array Deque: ");
        int n= in.nextInt();
        for (int i = 0; i < n; i++) {
            int value = in.nextInt();
            stack.push(value);
        }
        System.out.println("Stack Elements are: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop()+" ");
        }
    }
}
