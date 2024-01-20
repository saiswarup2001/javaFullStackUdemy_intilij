public class forLoop {
    public static void main(String[] args) {
        int num = 10;
        int y=10;
        for (int x=1; x<=num; x++){
            System.out.println(x);
        }

        for(int i=10; i>=1; i--){
            System.out.println(i);
        }

        for (; ;y--){
            System.out.println(y);
            if(y<=1){
                break;
            }
        }

        for (; y>1; y--){
            System.out.println(y);
        }
    }
}
