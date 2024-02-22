package Array;

import java.util.Scanner;

public class dynamicArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();
        System.out.println("Enter the array element: ");
        int []arr = new int[size];

        //dynamic initialization
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        //fetching the data from the array
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

    }
}
