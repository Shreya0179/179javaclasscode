import java.util.PriorityQueue;
public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        //----Adding elements

        pq.add(30);
        pq.add(10);
        pq.add(20);
        System.out.println("Queue is: "+pq); //minHeap Order //Parent smaller than child
        

        //----Add using offer method
        System.out.println("Added using offer: "+pq.offer(25));
        System.out.println(pq);

        //----Remove and print root element
        System.out.println("Deleted: "+ pq.poll()); //deletes 10 (priority element del first)
        System.out.println("Deleted: "+pq.poll()); //deletes 20

        //---peek method
        System.out.println("Element on the root: "+pq.peek());

        //----Remove method
        System.out.println("Removed: "+pq.remove());

        pq.clear();
        System.out.println(pq);

        //pq.remove();   //--throws error
        System.out.println(pq.poll()); //does not throw error and program continue to run
        System.out.println("Program is running");

        //-----Empty Method
        //System.out.println();

    }
}
