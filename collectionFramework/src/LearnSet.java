import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {
    public static void main(String[] args) {
//        Set<Integer> s = new HashSet<>();  //not fixed
//        Set<Integer> s = new LinkedHashSet<>(); //[11, 112, 22, 25, 35]
       Set<Integer> s = new TreeSet<>();  //[11, 22, 25, 35, 112]

        s.add(11);
        s.add(11);
        s.add(112);
        s.add(22);
        s.add(25);
        s.add(35);
        System.out.println(s);
        System.out.println("---remove----");
        s.remove(11);
        System.out.println(s);
        System.out.println("---contains----");
        System.out.println(s.contains(112));
        System.out.println("---isEmpty----");
        System.out.println(s.isEmpty());
        System.out.println("---size----");
        System.out.println(s.size());
        System.out.println("---clear----");
        s.clear();
        System.out.println(s);
    }
}


/* NOTES:
   HashSet-->
*   1. We cannot use duplicate elements in set
*   2. order is not fixed
    3. Time complexity: b(O)1
*
*  LinkedHashSet-->
*   1. Order is same as defined.
*   2. rest all operation is same as HashSet

   TreeSet-->
*   1. as it follows Binary Search Tech to sort element, so it stores the element in sorted manner.
*   2. rest all operation is same as HashSet
    3. Time complexity : b(Ologn)*/