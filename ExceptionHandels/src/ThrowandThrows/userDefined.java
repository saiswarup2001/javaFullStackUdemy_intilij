package ThrowandThrows;

import java.io.FileNotFoundException;
class UserDefinedException extends Exception{

}

public class userDefined {
    public static void main(String[] args) {
        try{
            Message();
        }catch(FileNotFoundException fe){
            System.out.println("catch of file not found");
        }catch (UserDefinedException ue){
            ue.printStackTrace();
        }catch(Exception e){
            System.out.println("catch of exception......");
        }
    }

    public static void Message() throws Exception, FileNotFoundException{
        int x = 2;

        switch (x){
            case 1: throw new FileNotFoundException();
            case 2: throw new Exception();
            default:
                throw new UserDefinedException();
        }

    }
}
