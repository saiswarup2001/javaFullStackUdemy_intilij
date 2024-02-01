package ScannerClass;

import java.util.Scanner;

public class evenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check: ");
        int num = sc.nextInt();
        System.out.println((num%2 == 0)? num+" is Even ": num+" is Odd");

    }
}
