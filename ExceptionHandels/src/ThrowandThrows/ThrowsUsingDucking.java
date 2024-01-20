package ThrowandThrows;
class A{
    public void show() throws ClassNotFoundException{
        Class.forName("Calc");
    }
}
public class ThrowsUsingDucking {
    public static void main(String[] args) {
        A a = new A();
        try{
            a.show();
        }catch (Exception e){
            e.printStackTrace();
            //System.out.println(e);
        }
    }
}
