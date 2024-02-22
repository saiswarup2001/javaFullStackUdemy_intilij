package operatos;

public class compoundOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        a /= (b-10);
        System.out.println(a);
    }
}

class a{
    public static void main(String[] args) {
        int a = 10;
        a %= 2;
        System.out.println(a);
    }
}

//martinSaving
class MartinSaving{
    public static void main(String[] args) {
        int money = 2000;
        //depo 500
        money += 500;
        //withdraw 1000
        money -= 1000;
        //fund transfer
        money -= 250;
        System.out.println("remain amount: "+ money);
    }
}