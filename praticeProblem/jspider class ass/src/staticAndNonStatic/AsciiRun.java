package staticAndNonStatic;

import java.util.Scanner;

class AsciiValue{

    static int getValue(char c){
        return (int)c;
    }
}
public class AsciiRun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the char: ");
        char ch = sc.next().charAt(0);
        int cha = AsciiValue.getValue(ch);
        System.out.println("ASCII value of "+ ch +" is: "+ cha);
    }
}
