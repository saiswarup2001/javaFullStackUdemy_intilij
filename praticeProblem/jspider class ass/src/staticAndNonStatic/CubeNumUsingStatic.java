package staticAndNonStatic;

import java.util.Scanner;

public class CubeNumUsingStatic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num: ");
        int num = sc.nextInt();
        System.out.println(cube(num));
    }

    static int cube(int n){
        return n*n*n;
    }
}
