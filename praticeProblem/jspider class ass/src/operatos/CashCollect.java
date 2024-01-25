package operatos;

public class CashCollect {
    public static void main(String[] args) {
        int withdrawAmount = 5400;
        int atnHave = 500;
        int count = withdrawAmount;

        withdrawAmount = withdrawAmount/atnHave;
        System.out.println("Total 500 notes: "+withdrawAmount);
        withdrawAmount = count % atnHave;
        System.out.println("Remaining Amount: "+withdrawAmount);


        int a = 20, b = -10;
        int c = a+ ++b;
        int d = a++ - b++ + ++c;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
