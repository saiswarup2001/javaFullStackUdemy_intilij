public class p3 {
    public static void main(String[] args) {
        int st = 1;
        for(int i=1; i<=5; i++){
            for(int j=1; j<=st; j++){
                System.out.print("* ");
            }
            System.out.println();
            if(i<=5/2){
                st++;
            }else{
                st--;
            }
        }
    }
}
