package ExceptionClass;

class Run{
    static void add() throws ArithmeticException{
        System.out.println("Add Methods..");
        System.out.println(10/0);
        System.out.println("Ends Method...");
    }
}
public class ThrowsException {
    public static void main(String[] args) {
        System.out.println("----Main Start----");
        try{
            Run.add();
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println("----Main End----");
    }
}
