package oops.inheritance.hierarical;


class Shape {
    //double area;
    void areaCal(){
        System.out.print("Area is: ");
    }
}

class Triangle extends Shape{
    double base;
    double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    void Display() {
        super.areaCal();
        System.out.println(0.5 * base * height);
        System.out.println();
    }
}

class Circle extends Shape{
    double rad;

    public Circle(double rad) {
        this.rad = rad;
    }

    void Display(){
        super.areaCal();
        System.out.println(3.14*(rad*rad));
        System.out.println();
    }
}

class Square extends Shape{
    double side;

    public Square(double side) {
        this.side = side;
    }

    void Display(){
        super.areaCal();
        System.out.println(side*side);
    }
}
