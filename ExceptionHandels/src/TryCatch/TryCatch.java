package TryCatch;

public class TryCatch {
    public static void main(String[] args) {
        int i = 0; //Normal
        int j = 0;
        try{
            j = 8/i; //critical statement
            System.out.println("Executed....");
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Something went wrong: "+ e);
        }
    }
}
