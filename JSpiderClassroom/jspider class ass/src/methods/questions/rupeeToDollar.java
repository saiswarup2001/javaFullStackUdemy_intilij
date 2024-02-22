package methods.questions;
/*
Design a method which can accepts rupees and print dollars in result.
 */
public class rupeeToDollar {
    public static void main(String[] args) {
        rupeeToDollarCon(8);
        rupeeToDollarCon(50);
        rupeeToDollarCon(25);
    }
    public static void rupeeToDollarCon(int rupee){
        double dollar = (double) rupee /64;
        System.out.println(dollar);
    }
}
