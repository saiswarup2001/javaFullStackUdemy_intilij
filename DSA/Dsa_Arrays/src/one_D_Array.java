public class one_D_Array {
    public static void main(String[] args) {

        int a[] = {8,4,6,8};
        //suppose we have to print the element 3
        System.out.println("Element 3 is: "+ a[2]);
        //suppose we have to print the element 1
        System.out.println("Element 1 is: "+ a[0]);

        // but we have to print multiple elements so sout method is not
        // suitable for its..
        //so, let's use for loop or for each loop to do so
        //using for loop
        for (int i=0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }

        // for each loop
        System.out.println();
        System.out.println("Foreach Loop");
        for (int i: a) {
            System.out.print(i + " ");
//            System.out.print(a[i] + " ");
        }
    }
}
