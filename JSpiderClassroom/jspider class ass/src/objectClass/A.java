package objectClass;

class Circle{
    int rad;

    Circle(int rad){
        this.rad = rad;
    }

    @Override
    public String toString() {
        return "rad = " + rad;
    }
}
public class A {
    public static void main(String[] args) {
        Circle c = new Circle(10);
        System.out.println(c.toString());
    }
}
