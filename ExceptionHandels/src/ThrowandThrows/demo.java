package ThrowandThrows;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class demo {
    public static void main(String[] args) {
        try{
            someMessage();
            ThrowKeyword();
        }catch (FileNotFoundException f){
            System.out.println("catch block of file not found...");
        }catch (Exception e){
            System.out.println("catch block of throw ...");
        }

    }

    public static void someMessage() throws FileNotFoundException {
        FileReader f = new FileReader("file.txt");
        System.out.println("message to main....");
    }

    public static void ThrowKeyword() throws Exception {
        System.out.println("throw keywords");
        throw new FileNotFoundException();
    }
}
