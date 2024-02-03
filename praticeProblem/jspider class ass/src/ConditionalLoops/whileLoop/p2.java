package ConditionalLoops.whileLoop;

public class p2 {
    public static void main(String[] args) {
        int num = 1;
        while(num<=10){
            if(num%2 == 0)
                System.out.println(num+" is Even number.");
            num++;
        }
    }
}
