package methodsQuestion;

import java.util.Scanner;

public class weightConveter {
    public static void main(String[] args) {
        double weightKgs;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the weight in Kgs: ");
        weightKgs = sc.nextDouble();
        weightconverterMachine(weightKgs);
    }

    private static void weightconverterMachine(double weightKgs) {
        //convert kg to gram
        double gram = weightKgs * 1000;
        System.out.println("Weight in Gram is : "+ gram );

        //convert kg to milligram
        double milligram = gram * 1000;
        System.out.println("Weight in milligram : "+ milligram);
    }
}
