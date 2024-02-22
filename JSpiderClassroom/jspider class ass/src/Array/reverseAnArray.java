package Array;

public class reverseAnArray {
    public static void main(String[] args) {
       int []a = {10,20,30,40,50};
        System.out.println("Before reversing: ");
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }

        int start = 0;
        int end = a.length - 1;
        System.out.println();
        System.out.println("After Reversing..");
        while(start < end){
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;

            start++;
            end--;
        }

        for(int i = 0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
    }
}


/*
 int []arr = {10,20,30,40,50};
//        int []revArr = new int[arr.length];
        System.out.println("Before the reverse array:");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        int len = arr.length;
        int a = len%10;
        System.out.println(a);


        //after reversing
        for(int j=0; j<len; j++){
//           revArr[j] = arr[len-j-1];
            for(int i=len; i>0; i--){
                arr[j] = arr[len%10];
            }
        }

        System.out.println("After the reverse array:");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
 */