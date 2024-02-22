package ConditionalLoops.ifElseIf;

import java.util.Scanner;

public class Election {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age....");
        int age = sc.nextInt();
        System.out.println("Hello!!"+"\n"+"Welcome to Election Commision");
        if(age>=18){
            System.out.println("You are Eligible....");
            System.out.println("Thank You....");
        }else{
            System.out.println("You are not eligible...");
            System.out.println("Thank you, Better Luck Next Time");
        }
    }
}
