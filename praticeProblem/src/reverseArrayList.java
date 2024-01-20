import java.util.ArrayList;
import java.util.Collections;

public class reverseArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<>();
        ar.add(1);
        ar.add(4);
        ar.add(5);
        ar.add(2);
        ar.add(3);

        System.out.print("Elements before reversing: ");
        System.out.println(ar);

        Collections.reverse(ar);
        System.out.print("\nElements after reversing: ");
        System.out.println(ar);
    }

}
