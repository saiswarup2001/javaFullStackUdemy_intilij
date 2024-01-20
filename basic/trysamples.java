public class trysamples {
    public static void main(String[] args) {
        for (int q = 0; q < 3; q++) {
            int n = 2 * (3 - q) - 1;
//            System.out.print("n:"+n);
            for (int e = 0; e < n; e++) {
                System.out.print(" ");
            }
            int b = 2*q+1;
//            System.out.print(b);
            for (int f=0; f<b; f++){
                System.out.print(f+" ");
            }
            System.out.println("");
        }
    }
}
