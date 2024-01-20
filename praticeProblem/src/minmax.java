//Input: arr[] = {3, 5, 4, 1, 9}
//        Output: Minimum element is: 1
//        Maximum element is: 9

public class minmax {
    public static void main(String[] args) {
        int arr[] = {3, 5, 4, 1, 9};
        int min = arr[0];
        int max = arr.length-1;

        for (int i=0; i< arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }else{
                max = arr[i];
            }
        }
        System.out.println("Min element is: "+ min);
        System.out.println("Max element is: "+ max);
    }
}
