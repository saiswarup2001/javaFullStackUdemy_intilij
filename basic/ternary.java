public class ternary {
    public static void main(String[] args) {

        int a = 10;
        boolean result;
        int d;
        // (if condition) ? if condition is true : if condition is false
        result = (a%2==0)? true : false;
        d = (a>=20) ? a : a/10;
        System.out.println(d);
        System.out.println(result);
    }
}
