package staticAndNonStatic;

import java.util.Scanner;
class Cube{
    int getCubeNum(int num){
        return (num*num*num);
    }
}
public class CubeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to get the code: ");
        Cube num1 = new Cube(); //obj creation
        int num = sc.nextInt(); //takes num as a input
        int getCube = num1.getCubeNum(num); //get the op
        System.out.println("the cube of "+ num+ " is: "+ getCube);

    }
}

