import java.util.Arrays;

public class LearnArrayClass {
    public static void main(String[] args) {

        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int index = Arrays.binarySearch(a, 4);
        System.out.println("Element found at index "+index); //Element found at index 3
        System.out.println("------------------------------------");
        //sorting
        Integer[] num = {11, 52, 48, 1, 60, 105, 19, 64, 0};
        Arrays.sort(num);

         //parallel sort -> 8192
        //Arrays.fill(num, 12); //12 12 12 12 12 12 12 12 12
        for (int i : num) {
            System.out.print(i + " ");
        }
    }
}
