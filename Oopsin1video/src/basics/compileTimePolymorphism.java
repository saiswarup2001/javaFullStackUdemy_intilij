package basics;
//Same method name and return type but different signatures
class ctp {
    public static int add(int x, int y) { //method Name: add || signature: int int
        return x + y;
    }

    public static int add(float x, float y) { //method Name: add || signature: float float
        return (int) (x + y);
    }

    public static int add(double x, int y) { //method Name: add || signature: double int
        return (int) (x + y);
    }
}
public class compileTimePolymorphism {
    public static void main(String[] args) {
        ctp a = new ctp();
        int INT = ctp.add(10,20);
        int DINT = ctp.add(20.5d, 15);
        int FLOAT = ctp.add(50.5f, 50f);
        System.out.println("int int: "+ INT);
        System.out.println("double int: "+ DINT);
        System.out.println("float float: "+ FLOAT);
    }
}
