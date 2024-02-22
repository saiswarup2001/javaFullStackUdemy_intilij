package staticAndNonStatic.questions;

import java.util.Scanner;

class Sqr {
    private int num;

    public void setNum(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }
}

class SqrRun {
    private Sqr obj;

    public SqrRun(Sqr obj) {
        this.obj = obj;
    }

    public int squareOfNum() {
        int num1 = obj.getNum();
        return num1 * num1;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num: ");
        int inputNum = sc.nextInt();

        Sqr s = new Sqr();
        s.setNum(inputNum);

        SqrRun sr = new SqrRun(s);
        int res = sr.squareOfNum();

        System.out.println("The square of the " + s.getNum() + " is: " + res);
    }
}
