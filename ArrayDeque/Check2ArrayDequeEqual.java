package Codegnan_Dialy_Test;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Scanner;

public class Check2ArrayDequeEqual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayDeque<Integer>d1 = new ArrayDeque<>();
        System.out.println("Enter No. of elements in d1:");
        int n1 = sc.nextInt();
        for (int i = 0; i < n1; i++) {
            d1.add(sc.nextInt());
        }
        ArrayDeque<Integer>d2 = new ArrayDeque<>();
        System.out.println("Enter No. of elements in d2:");
        int n2 = sc.nextInt();
        for (int i = 0; i < n2; i++) {
            d2.add(sc.nextInt());
        }
        boolean areEqual = dequeEquals(d1,d2); 
        System.out.println(areEqual);
    }
    private static boolean dequeEquals(ArrayDeque<Integer> d1, ArrayDeque<Integer> d2) {
        if(d1.size()!= d2.size()){
            return false;
        }
        Iterator<Integer> it1 = d1.iterator();
        Iterator<Integer> it2 = d2.iterator();
        while(it1.hasNext() && it2.hasNext()){
            if(!it1.next().equals(it2.next())){
                return false;
            }
        }
        return true;
    }
    
}
