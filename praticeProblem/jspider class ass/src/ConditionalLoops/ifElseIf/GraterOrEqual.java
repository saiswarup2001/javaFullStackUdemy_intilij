package ConditionalLoops.ifElseIf;

import java.util.Scanner;

public class GraterOrEqual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num == 10){
            System.out.println(num +" is equal to 10..");
        } else if (num>10) {
            System.out.println(num+ " is greater than 10");
        }else{
            System.out.println(num+" is less than 10");
        }
    }
}
