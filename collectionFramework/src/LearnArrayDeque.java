import java.util.ArrayDeque;
import java.util.Iterator;

public class LearnArrayDeque {
    public static void main(String[] args) {

        ArrayDeque<Integer> ad = new ArrayDeque<>();
        //by default, it pushes the element in the last
        ad.offer(10);
        ad.offer(15);
        System.out.println(ad); //[10, 15]
        System.out.println("-------------first and last--------------");
        ad.offerFirst(9); //push element in the first
        ad.offerLast(16); //push element in the last
        System.out.println(ad); //[9, 10, 15, 16]
        System.out.println("-------------peek, peekFirst & peekLast--------------");
        System.out.println(ad.peek()); //9
        System.out.println(ad.peekFirst()); //9
        System.out.println(ad.peekLast()); //16
        System.out.println("-------------poll, pollFirst & pollLast--------------");
        System.out.println("Queue : "+ ad);      //Queue : [9, 10, 15, 16]
        System.out.println(ad.poll());           //9
        System.out.println("poll : "+ ad);       //poll : [10, 15, 16]
        System.out.println(ad.pollFirst());      //10
        System.out.println("pollFirst : "+ ad);  //poll : [15, 16]
        System.out.println(ad.pollLast());       //16
        System.out.println("pollLast : "+ ad);   //[15]
    }
}
