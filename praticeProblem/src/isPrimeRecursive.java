import java.util.Scanner;

public class isPrimeRecursive {

    public static boolean isPrime(int num, int i) {
        System.out.println("i: "+ i);
        if (i <= 1) {
            System.out.println(i+"<=1: true");
            return true;
        }
        System.out.println("----------------------------");
        int d = num%i;
        System.out.println("d: "+ d );
        if (d == 0) {
            System.out.println(num+ " % "+ i +"== 0: false");
            return false;
        }
        return isPrime(num, i - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check: ");
        int num = sc.nextInt();

        if (isPrime(num, num / 2)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}
