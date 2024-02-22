package staticAndNonStatic;

class Calci{
    static int add(int a, int b){
        return a+b;
    }
}
public class StaticMethod {
    public static void main(String[] args) {
        int x=10, y=20;
        int res = Calci.add(x,y); //static method call
        System.out.println(res);
    }
}
