package ConditionalLoops.forLoop;

import java.util.Scanner;

public class f4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to get the multiplication table: ");
        int mul = sc.nextInt();
        for(int i=1; i<=10; i++){
            System.out.println(mul+" * "+ i +" = "+ (mul*i));
        }
    }
}
