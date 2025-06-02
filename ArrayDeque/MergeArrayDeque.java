package Codegnan_Dialy_Test;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.Scanner;

public class MergeArrayDeque {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque1 = new ArrayDeque<>();
        Deque<Integer> deque2 = new ArrayDeque<>();
        System.out.println("No of elements in deque1:");
        int n1 = in.nextInt();
        for (int i = 0; i < n1; i++) {
            deque1.add(in.nextInt());
        }
        System.out.println("No of elements for deque2:");
        int n2 = in.nextInt();
        for (int i = 0; i < n2; i++) {
            deque2.add(in.nextInt());
        }
        ArrayList<Integer>mergedList = new ArrayList<>(deque1);
        mergedList.addAll(deque2);
        // System.out.println(mergedList);

        Collections.sort(mergedList);
        Deque<Integer> sortedDeque = new ArrayDeque<>(mergedList);
        System.out.println("Sorted Merged Deque");
        for (Integer integer : sortedDeque) {
            System.out.print(integer + " ");
        }
        
    }
}