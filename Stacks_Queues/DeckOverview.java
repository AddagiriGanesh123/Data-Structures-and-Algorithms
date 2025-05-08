package Stacks_Queues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.DelayQueue;
// Deque: Unlike queue Doubly ended queue is also known as Deck in pronounciation
// One familiar thing about dequeue is we can insert and delete at both ends either from front or last
public class DeckOverview {
    public static void main(String[] args) {
      Deque<Integer> deque = new ArrayDeque<>();
      // ArrayDeque class basically provides to creatre an object of the methods that we mentioned like the deque interface
      // In inteface there are several classes those are implementing the interface by deque
      // ArrayDeque is one of them and it is resizable
      // -> ArrayDeque is not a Storage Capacitor it is a dynamic array up to it's grown up
      // this class is faster than stack when it is use as stack and faster than linkdlist when it is used as Queue
      // Why it promotes better familiarith than stacks anad linkedlists beacuse it is used to delete/insert though the both the ends
      // Null values are allowed in ArrayDeque and it is not thread safe
      // It has great usage in trees
      deque.add(1);
      deque.addFirst(9);
      deque.add(5);
      deque.addLast(18);
      System.out.println(deque); // [9, 1, 5, 18]
      deque.remove();
      deque.removeFirst();
      System.out.println(deque); // [5, 18]
    }
}
