public class p2 {
    public static void main(String[] args) {
        int st = 1;
        int sp = 3;
        for (int i=1; i<=4; i++){
            for(int j=1; j<=sp; j++){
                System.out.print(" ");
            }
            for (int k=1; k<=st; k++){
                System.out.print("* ");
            }
            System.out.println();
            st++;
            sp--;
        }
    }
}
