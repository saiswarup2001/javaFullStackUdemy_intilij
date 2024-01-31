package methods;

public class noArgumentMethod {
    public static void main(String[] args) {
        add(); //calling no argument method
        add(10,30); // calling with formal argument
    }
    public static void add(){ //no - argument method
        int a = 10;
        int b = 20;
        System.out.println(a+b);
    }

    //method with arguments / parameterized method
    public static void add(int a, int b){ // here a and b are actual arguments
        System.out.println(a+b);
    }
}

/*
NOTES:
    Method is classified in two parts:
     1.Based on Arguments.
        a) No- arguments method.
        b) Parameterized method.

 */