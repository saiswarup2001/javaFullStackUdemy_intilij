import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
    1
    3 2
    4 5 6
    10 9 8 7
 */
public class n5 {
    public static void main(String[] args) throws IOException {

        int count;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //outer-loop
        for (int i = 1; i <= n; i++) {
            //inner loop
            if (i % 2 != 0) {
                count = (i*(i-1))/2+1;
                for (int j = 1; j <= i; j++) {
                    System.out.print(count++ + " ");
                }
            } else {
                count = (i*(i+1))/2;
                for (int j = 1; j <= i; j++) {
                    System.out.print(count-- + " ");
                }
            }
            System.out.println();
        }

//        BufferedReader br =new BufferedReader (new InputStreamReader(System.in));
//        int n, i, j, a;
//        System.out.print ("Enter N value:");
//        n = Integer.parseInt (br.readLine());
//
//        for (i = 1; i <= n; i++)
//        {
//            if (i % 2 == 0)
//            {
//                a = (i * (i + 1)) / 2;
//                for (j = 1; j <= i; j++)
//                {
//                    System.out.print (a--);
//                }
//            }
//            else
//            {
//                a = (i * (i - 1)) / 2 + 1;
//                for(j = 1; j <= i; j++)
//                {
//                    System.out.print (a++);
//                }
//            }
//            System.out.println ();
//        }
    }
}


class NameString{
    public static void main(String[] args) {
        String name = "Sai Swarup Patnaik";
        System.out.println(name);
    }
}

class CharA{
    public static void main(String[] args) {
        //char a = (char)65;
        System.out.println('a');
    }
}

class DecimalLiteral{
    public static void main(String[] args) {
//        double a = 99.546;
        System.out.println(99.546);
    }
}