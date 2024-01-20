public class fib {
    public static void main(String[] args) {
        int a = 0, b = 1;
        int c = 0;
        int n = 10;

        for(int i=0; i<=n; i++){
            if(a<=n){
                System.out.print(a+"");
                c = a+b;
                a = b;
                b = c;
            }
        }
    }
}
