package methodOverloading;

public class Calculator {


    //Method overloading
    //add method
    public static void cal(int number1, int number2){
        System.out.println("Sum is: "+ (number1+number2));
    }

    //sub
    public static void cal(int number1, double number2){
        System.out.println("Sub is: "+ ((double)number1-(number2)));
    }

    //mul
    public static void cal(float number1, float number2){
        System.out.println("Mul isd: "+ number1*number2);
    }

    //div
    public static void cal(long number1, long number2){
        System.out.println("div is: "+ number1/number2);
    }



}
