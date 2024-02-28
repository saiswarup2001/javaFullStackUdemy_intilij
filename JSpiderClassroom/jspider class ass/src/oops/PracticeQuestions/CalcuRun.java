package oops.PracticeQuestions;

class Calculator{
    static void multi(int a, int b){
        System.out.println(a*b);
    }

    static void multi(String a, String b){
        System.out.println(a+b);
    }

    static void multi(char a, int b){
        System.out.println(a+b);
    }

    static void multi(double a, int b){
        System.out.println(a*b);
    }
}
public class CalcuRun {
    public static void main(String[] args) {
        Calculator.multi(10,20);
        Calculator.multi("Sai", "Swarup");
        Calculator.multi(5.5, 10);
        Calculator.multi('a',20);

    }
}
