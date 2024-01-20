// sum of digits == 1234 == 1+2+3+4 = > 10


public class sumOfDigits {
    public static void main(String[] args) {
        int num = 8060925;
        int sumOfDigit = 0;
        while(true){
            int rem = num % 10;
            sumOfDigit = sumOfDigit + rem;
            num = num / 10;
            if(num <= 0){
                break;
            }
        }
        System.out.println("Sum of digits is: "+sumOfDigit);
    }
}
