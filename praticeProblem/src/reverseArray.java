
public class reverseArray {
    public static void main(String[] args) {
        int a[] ={1, 2, 4, 5, 3};
//        int temp = a[0];
        System.out.print("Before Reversing the array: ");
        for (int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
        for(int i=0; i<a.length/2; i++){
            int temp = a[i];
            a[i] = a[a.length-i-1];
            a[a.length-i-1] = temp;
        }

        System.out.println("");
        System.out.print("After Reversing the array: ");
        for (int j=0; j<a.length; j++){
            System.out.print(a[j]+" ");
        }
    }
}




//System.out.println("temp ="+ temp);
//System.out.println("a[a.length-i-1]: "+ a[a.length-i-1]);
//System.out.println("a[i]: "+ i + a[i]);