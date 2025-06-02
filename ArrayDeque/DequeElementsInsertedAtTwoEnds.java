package Codegnan_Dialy_Test;
import java.util.ArrayDeque;
import java.util.Scanner;

public class DequeElementsInsertedAtTwoEnds {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayDeque<Integer>deque = new ArrayDeque<>();
        System.out.println("Enter no elements to be in the Deque: ");
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int value = in.nextInt();
            if(i%2 == 0){
                deque.addLast(value);
            }else{
                deque.addFirst(value);
            }
        }
        for (Integer number : deque) {
            System.out.print(number + " ");
        }
    }
}
