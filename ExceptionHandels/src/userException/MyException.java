package userException;

class UserException extends Exception{
    public UserException(String s){
        super(s);
    }
}
public class MyException {
    public static void main(String[] args) {
        int i =20;
        int j = 0;

        try{
            j = 18/i;
            if(j == 0)
                throw new UserException("HI I am  user...");
        }catch(UserException ue){
            j = 18/1;
            System.out.println("Hi i am catch ///"+ ue);
        }
    }
}
