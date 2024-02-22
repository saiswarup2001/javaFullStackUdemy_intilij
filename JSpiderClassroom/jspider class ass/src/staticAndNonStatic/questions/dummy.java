package staticAndNonStatic.questions;

import java.util.Scanner;

class SqrCalu {
    private int num;

    public void setNum(int num) {
        this.num = num;
    }

    public int getSquare() {
        return num * num;
    }
}

public class dummy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int inputNum = scanner.nextInt();

        SqrCalu cal = new SqrCalu();
        cal.setNum(inputNum);

        int square = cal.getSquare();
        System.out.println("The square of " + inputNum + " is: " + square);

    }
}
