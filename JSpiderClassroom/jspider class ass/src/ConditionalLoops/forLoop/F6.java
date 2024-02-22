package ConditionalLoops.forLoop;

public class F6 {
    public static void main(String[] args) {
        char ch = 'A';
        int alpha = (int)ch;

        for(int i=1; i<=26; i++){
            System.out.println((char)alpha);
            alpha = alpha+1;
        }
    }
}
