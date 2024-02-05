package Array;

public class CreatArray {
    public static void main(String[] args) {

        //declaration of array = Datatype []identifier = new Datatype[size];
        int []a = new int[5];

        //to get the length = arr_reference.length;
        System.out.println("Length: "+ a.length);

        //store data inside a array
        a[0] = 10;
        a[1] = 20;
        a[2] = 10 + 20;
        int b = 40;
        a[3] = b;
        a[4] = b+10;

        //fetching the data from array
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]);
        System.out.println(a[4]);
    }
}
