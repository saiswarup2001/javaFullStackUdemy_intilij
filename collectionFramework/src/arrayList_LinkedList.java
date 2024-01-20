import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class arrayList_LinkedList {
    public static void main(String[] args) {

//        String Students[] = new String[30];
//        Students[0] = "Sai";
//        Students[29] = "MOhit";
//        //Students[30] = "Ram"; //java.lang.ArrayIndexOutOfBoundsException: Because we know that array is not dynamic type.that's y it have fixed size.
//        int length = Students.length;
//        System.out.println("Length is : "+ length);
//        for(int i=0; i<length; i++){
//            System.out.println(Students[i]);
//        }
        System.out.println("--------------------------------------------------------------------------");
//        array is not dynamic type.that's y it have fixed size. so as to overcome this arrayList is Introduced as ArrayList is dynamic in nature
//        List<String> ar = new ArrayList<>();
        List<String> ar = new LinkedList<>();
        //an empty array is included
        ar.add("Sai"); //When it added then it will create an array of 10 by default. After 10th ele if we add then it add more space i.e. => size = n+n/2+1;
        ar.add("Ram");
        ar.add("kishore");
        int len = ar.size();
        System.out.println("Len is : "+len);
        for(int i=0; i<ar.size(); i++){
            System.out.println(ar.get(i));
        }

        System.out.println("-----------------Array Decleration => ArrayList<Integer> li = new ArrayList<>();------------------");
        ArrayList<Integer> li = new ArrayList<>();
        System.out.println();
        System.out.println("--------------------add()----------------------");
        li.add(0,1);
        li.add(1,2);
        li.add(2,3);
        li.add(3,4);
        li.add(4,5);
        li.add(5,6);
        li.add(6,7);
        li.add(7,8);
        li.add(8,9);
        li.add(9,10);
        li.add(10,0);
       // li.add(15,2);
        int le = li.size();
        System.out.println("Length : "+le); //11
        System.out.println("ArrayList : "+li); //[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0]

        System.out.println();
        System.out.println("--------------for loop-----------------");
        for (int i=0; i<li.size(); i++ ){
            System.out.println("element is: "+ li.get(i));
        }

        System.out.println("--------------for-each loop-----------------");
        for (Integer i : li) {
            System.out.println("foreach is: "+ li.get(i));
        }

        System.out.println();
        System.out.println("-------------Iterator----------------");
        Iterator<Integer> it = li.iterator();
        while(it.hasNext()){
            System.out.println("Iterator : "+it.next());
        }


        ArrayList<Integer> newArray = new ArrayList<>();
        newArray.add(14);
        newArray.add(180);
        System.out.println();
        System.out.println("New Array"); //New Array
        System.out.println("-------------------addAll()----------------------------");
        li.addAll(newArray); //this will add all the elements of the newarray to the old array
        System.out.println("New ArrayList : "+li); //[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 14, 180] //here the length is 13

        System.out.println();
        System.out.println("--------------get()-----------------");
        System.out.println("8th Position : "+li.get(8));  //9
        System.out.println("11th Position : "+li.get(11)); //14
        //System.out.println(li.get(15)); //Index 15 out of bounds for length 13

        System.out.println();
        System.out.println("--------------remove()-----------------");
        System.out.println("Before remove : "+li); //[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 14, 180]
        li.remove(10); // 0 is removed => [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 14, 180]
        li.remove(5); // 6 is removed => [1, 2, 3, 4, 5, 7, 8, 9, 10, 14, 180]
        li.remove(2); // 3 is removed => [1, 2, 4, 5, 7, 8, 9, 10, 14, 180]
        System.out.println("After remove : "+ li); //[1, 2, 4, 5, 7, 8, 9, 10, 14, 180]

        System.out.println();
        System.out.println("--------------removeAll()-----------------");
        System.out.println("Before remove : "+li); //[1, 2, 4, 5, 7, 8, 9, 10, 14, 180]
        li.removeAll(newArray);//[14, 180] <= this is the newArray and it is removed from li.
        System.out.println("After remove : "+ li); //[1, 2, 4, 5, 7, 8, 9, 10]

        System.out.println();
        System.out.println("--------------set()-----------------");
        System.out.println("Before set : "+li); //[1, 2, 4, 5, 7, 8, 9, 10]
        li.set(1,1000);
        System.out.println("After set : "+ li); //[1, 1000, 4, 5, 7, 8, 9, 10]

        System.out.println();
        System.out.println("--------------contains()-----------------");
        System.out.println(li.contains(1000)); //true
        System.out.println(li.contains(2)); //false
    }
}
