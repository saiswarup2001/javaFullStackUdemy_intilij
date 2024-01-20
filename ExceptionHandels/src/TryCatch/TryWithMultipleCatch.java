package TryCatch;

public class TryWithMultipleCatch {
    public static void main(String[] args) {
        int i = 2; //Normal
        int j = 0;

        int[] arr = new int[5];
        String str = null;
        try{
            j = 8/i; //critical statement
            System.out.println(arr[1]);
            System.out.println(arr[5]);
        }catch(ArithmeticException ae){
            ae.printStackTrace();
            System.out.println("Something went wrong in ae: "+ ae);
        }catch(ArrayIndexOutOfBoundsException re){
            re.printStackTrace();
            System.out.println("Stay in limit "+ re);
        }catch(Exception e){
            System.out.println("Bapp of every one "+ e);
        }
    }
}
