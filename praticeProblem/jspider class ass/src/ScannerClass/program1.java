package ScannerClass;

import java.util.Scanner;

public class program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age: ");
        int age = sc.nextInt();

        System.out.println((age>=18)?"Eligible":"Not Eligible");
    }
}
