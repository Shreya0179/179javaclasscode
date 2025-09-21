import java.util.ArrayDeque;

public class ArrayDequeExample {
    public static void main(String[] args) {
        ArrayDeque<String> deque = new ArrayDeque<>();

        //Add Elements //program terminates if NULL
        deque.add("A");
        deque.addFirst("F");
        deque.addLast("L");
        System.out.println(deque);

        //Add using offer //program not terminate if NULL
        deque.offer("C");
        deque.offerFirst("First");
        deque.offerLast("Last");
        System.out.println(deque);

        //Access elements
        System.out.println("First element (peek): "+ deque.peek());
        System.out.println("First element (peekFirst): "+ deque.peekFirst());
        System.out.println("First element (peekLast): "+ deque.peekLast());

        //Remove Elements
        System.out.println("\nRemoving elements");
        System.out.println("Removed First (removeFirst): "+ deque.removeFirst());
        System.out.println("Removed Last (removeLast): "+deque.removeLast());
        System.out.println("Removed first (pollFirst): "+ deque.pollFirst());
        System.out.println("Removed Last (pollLast): "+deque.pollLast());
        System.out.println("Deque after removals: ");
        System.out.println(deque);

    }
}
//ArrayDeque
//faster than linked list
//null elements not allowed
//Not thread safe i.e not synchronised
//Implements Deque Interface
//Dynamic Resizing
//No Capacity Restrictions