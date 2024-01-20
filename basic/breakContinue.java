public class breakContinue {
    public static void main(String[] args) {
        int n = 5;
        for(int i=0; i<10; i++){
            //System.out.println(i);
            if(i == n){
                continue;
            }
            System.out.println(i);
        }
    }
}
