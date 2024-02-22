package oops.inheritance.multilevelinheritance;

public class Triangle extends Shape {

    double base;
    double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    void AreaCal() {
        super.AreaCal();
        System.out.println(base*height);
    }
}
