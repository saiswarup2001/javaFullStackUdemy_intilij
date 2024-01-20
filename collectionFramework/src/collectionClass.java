import java.util.*;

public class collectionClass {
    public static void main(String[] args) {

        List<Integer> li = new ArrayList<>();
        li.add(10);
        li.add(30);
        li.add(90);
        li.add(60);
        li.add(80);
        li.add(70);
        li.add(70);
        System.out.println(li); //[10, 30, 90, 60, 80, 70]
        System.out.println("min element is : "+ Collections.min(li)); //min element is : 10
        System.out.println("max element is : "+ Collections.max(li)); //max element is : 90
        System.out.println("element is : "+ Collections.EMPTY_LIST); //element is : []
        System.out.println("element frequence is : "+ Collections.frequency(li, 70)); //element frequence is : 2

        System.out.println("----------sorting----------");
        Collections.sort(li);
        System.out.println(li); //[10, 30, 60, 70, 70, 80, 90]
        Collections.sort(li , Comparator.reverseOrder());
        System.out.println(li); //[90, 80, 70, 70, 60, 30, 10]
    }
}
