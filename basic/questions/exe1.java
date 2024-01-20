package questions;

public class exe1 {
    public static void main(String[] args) {
        //(a+b) square = ((a*a)+2ab+(b*b))

        int a = 25;
        float b = 42.159f;
        int val = (int)((a*a) + 2*(a*b) + (b*b)); //type casting
        System.out.println(val);
    }
}
