package oops.inheritance.multilevelinheritance;

public class main {
    public static void main(String[] args) {
        Triangle rt = new RightriangleTriangle(10, 20);
        System.out.println(rt.base);
        System.out.println(rt.height);
        rt.AreaCal();
    }
}
