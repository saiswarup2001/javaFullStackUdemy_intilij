package operatos;

public class productGStProblem {
    public static void main(String[] args) {
        int p1 = 1250;
        int p2 = 1450;
        int pGst1 = p1*12/100;
        int pGst2 = p2*12/100;

        int totalBill = p1 + p2 + pGst1 + pGst2;
        //int totalBill = (p1 + p2 )*12/100;
        System.out.println("The total amount is: "+ totalBill);
    }
}
