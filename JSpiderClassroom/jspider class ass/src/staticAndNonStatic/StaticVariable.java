package staticAndNonStatic;

public class StaticVariable {
    static int a = 10;
    static void display(){
        System.out.println("from display: "+ a);
    }

    public static void main(String[] args) {
        display();
        System.out.println("From main: "+a);
    }
}
