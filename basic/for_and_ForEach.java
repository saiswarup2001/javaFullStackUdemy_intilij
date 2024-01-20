public class for_and_ForEach {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int sum = 0;
        int val = 5;
        boolean found = false;
//        for (int i=0; i<a.length; i++){
//            System.out.println(i);
//            sum += a[i];
//        }
//        System.out.println(sum);

        System.out.println("ForEach Loop");

//        for (int x:a) {
//            System.out.println("value of x : "+ x);
//            sum = sum + x;
//            if(x == 5) break;
//        }
//        System.out.println("Sum is : "+sum);


        //to find value
        for (int z : a) {
//            System.out.println("value of z: "+z);
            if(z == val)
                found = true;
                break;
        }
        if(found == true){
            System.out.println("value found");
        }
    }
}
