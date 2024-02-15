package staticAndNonStatic;

public class StaticInitalizer {
    static {
        System.out.println("Static block 1");
    }
    public static void main(String[] args) {
        System.out.println("Main Method...");
    }

    static{
        System.out.println("Static block 2");
    }
}
