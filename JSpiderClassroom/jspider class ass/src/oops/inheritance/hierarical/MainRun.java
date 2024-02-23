package oops.inheritance.hierarical;

public class MainRun {
    public static void main(String[] args) {
        Triangle t = new Triangle(2, 5);
        System.out.println("Base: "+ t.base);
        System.out.println("Height: "+ t.height);
        t.Display();

        Circle c = new Circle(2);
        System.out.println("Radius: "+ c.rad);
        c.Display();

        Square s = new Square(4);
        System.out.println("Side: "+ s.side);
        s.Display();
    }
}
