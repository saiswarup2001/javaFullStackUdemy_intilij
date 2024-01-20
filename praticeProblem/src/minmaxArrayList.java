import java.util.ArrayList;

public class minmaxArrayList {
    public static void main(String[] args) {
        //converting arra into arrayList
        int arr[] = {1, 2, 3};
        ArrayList<Integer> ar = new ArrayList<>();
        for (int i=0; i<arr.length; i++){
            ar.add((arr[i]));
        }
        System.out.println(ar); //stores the given array into the arrayList
        int min = ar.get(0);
        int max = ar.get(ar.size()-1);

        //Logic for finding the array maximum and minium element
        for (int i=0; i<ar.size(); i++){
            if(ar.get(i) < min){
                min = ar.get(i);
            }else{
                max = ar.get(i);
            }
        }
        System.out.println("Max element is: "+ max);
        System.out.println("Min element is: "+ min);
    }
}