import java.util.Scanner;

public class JavaStringReverse {
    public static void main(String[] args) {
        String A;
        Scanner sc = new Scanner(System.in);
        A = sc.next();
        StringBuilder sb = new StringBuilder();
        String temp;
        /* Enter your code here. Print output to STDOUT. */
        for(int i=A.length()-1; i>=0; i--){
            sb.append(A.charAt(i));
        }
        //System.out.println(sb.toString());
        temp = sb.toString();
        //System.out.println(temp);
        if(temp.equals(A)){
            System.out.print("yes");
        }
    }
}
