package multipleCatchBlock;

public class AppMultiCatch {
    public static void main(String[] args) {
        int x;
        try{
            x = 10/0;
            System.out.println("statment not executed");
        } catch (ArithmeticException ae){
            System.out.println("ArithmeticException occurred");
        } catch(RuntimeException re){
            System.out.println("I am runtime Exception");
        } catch(Exception e){
            e.printStackTrace();
            System.out.println("Inside exception block");
        }
    }
}

// parent: java.util.object; -> subclass: java.util.Throwable; ->
// subclass: java.util.Exception; ->
// subclass: java.util.RuntimeException; -> subclass: java.util.ArithmeticException;