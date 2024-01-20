import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueue {
    public static void main(String[] args) {

        Queue<Integer> Q = new LinkedList<>();
        System.out.println("----------------offer()----------------");
        Q.offer(12);
        Q.offer(22);
        Q.offer(33);
        System.out.println(Q); //[12, 22, 33]
        System.out.println();
        System.out.println("------------------poll()------------------");
        System.out.println(Q.poll()); //12
        System.out.println(Q); //[22, 33]
        System.out.println();
        System.out.println("------------------peek()------------------");
        System.out.println(Q.peek()); //22
        System.out.println();
        System.out.println("------------------add()------------------");
        Q.add(10);
        System.out.println(Q); //[22, 33, 10]
        System.out.println();
        System.out.println("------------------element()------------------");
        System.out.println(Q.element()); //22
        System.out.println();
        System.out.println("------------------remove()------------------");
        System.out.println("Removed : "+Q.remove()); //Removed : 22
        System.out.println("Removed : "+Q.remove()); //Removed : 33
        System.out.println("Removed : "+Q.remove()); //Removed : 10
        System.out.println("Removed : "+ Q.peek());
       // System.out.println("Removed : "+Q.remove()); //Removed :  throws Empty
//        System.out.println(Q); //[]
        System.out.println(Q.add(10));
        System.out.println(Q.add(20));
        System.out.println(Q.add(30));
        System.out.println(Q.add(40));
        System.out.println(Q);

    }
}




/* NOTES:-->
*   Queue work in FIFO Method.
*   1. offer() -> used to add element inside the queue
*   2. poll() -> used to remove the element and shows which element is piped/removed
*   3. peek() -> say's which element is next in line to be removed
*   4. add() -> Inserts the specified element into the queue. if the task is success then it returns true else throws an exception
*   5. element() -> Returns the head of the queue. Throws exception if the head is empty
*   6. remove() -> Returns and Remove the head of the queue a throws exception if head is empty. */