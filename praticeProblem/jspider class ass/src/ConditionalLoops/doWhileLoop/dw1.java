package ConditionalLoops.doWhileLoop;

import java.util.Scanner;

public class dw1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch;
        do{
            System.out.println("Welcome..");
            System.out.println("Do you want to print it again..");
            System.out.println("if yes press Y/y or if no Press N/n");
            ch = sc.next().charAt(0);

        }while (ch=='y' || ch=='Y');
    }
}
