package questions;

import java.util.Scanner;
public class exe2 {
    public static void main(String[] args) {
        int c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of columns");
        c = sc.nextInt();
        System.out.println("----------------------------------- ");
        /*  @
         *  @ @
         *  @ @ @
         *  @ @ @ @  */
        for(int i=0; i<c; i++){
            for (int j=0; j<=i; j++){
                System.out.print("@"+" ");
            }
            System.out.println(" ");
        }
        System.out.println();
        System.out.println("Right Half Pyramid");
        System.out.println("----------------------------------- ");

        /*  @ @ @ @
         *  @ @ @
         *  @ @
         *  @
         *            */
        for(int k=0; k<c; k++){
            for (int l=c; l>k; l--){
                System.out.print("@"+" ");
            }
            System.out.println(" ");
        }
        System.out.println();
        System.out.println("Inverted Right half Pyramid");
        System.out.println(" -------------------------------------------------");

        /*      @
        *    @  @  @
        * @  @  @  @  @ */

        for(int q=0; q<c; q++){
            int n = 2*(c-q)-1;
//            System.out.print(n);
            //for printing the space
            for (int e=0; e<n; e++){
                System.out.print(" ");
            }
            int b = 2*q+1;
//            System.out.println(b);
            //for printing the @
            for (int f=0; f< b; f++){
                System.out.print("@ ");
            }
            System.out.println(" ");
        }
        System.out.println();
        System.out.println("Full Pyramid");
        System.out.println("------------------------------------");
        /*       @
         *     @ @
         *   @ @ @
         * @ @ @ @ */
        for(int u=0; u<c; u++){
            //for printing the space
            for(int v=0; v<2*(c-u)-1; v++){
                System.out.print(" ");
            }
            //for printing the @
            for (int w=0; w <= u; w++){
                System.out.print("@ ");
            }
            System.out.println("");
        }
        System.out.println();
        System.out.println("Left Half Pyramid");
        System.out.println("------------------------------------");

        /* @ @ @ @ @
        *    @ @ @ @
        *      @ @ @
        *        @ @
        *          @
        *           */

        for(int i=0; i<c; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("@ ");
            }
            for (int t = 0; t < c - i; t++) {
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}

