package ConditionalLoops.ifElseIf;

import java.util.Scanner;

public class greatestOfTwoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a and b: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a>b){
            System.out.println("a = "+a + " is greater than b = "+ b);
        }else{
            System.out.println("b = "+b + " is greater than a = "+ a);
        }
    }
}
