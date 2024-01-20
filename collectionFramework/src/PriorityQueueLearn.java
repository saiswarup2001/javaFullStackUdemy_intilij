import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueLearn {
    public static void main(String[] args) {

        Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder()); //By default, it is in minorder to execute in max order we have to use => Comparator.reverseOrder()
        pq.offer(40);
        pq.offer(12);
        pq.offer(24);
        pq.offer(36);

        System.out.println(pq); //[40, 36, 24, 12]

        pq.poll();
        System.out.println(pq); //[36, 12, 24]

        System.out.println(pq.peek()); //36

    }
}
