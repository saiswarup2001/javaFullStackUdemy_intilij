package methods.questions;
/*
Design a method which can accepts radius of a circle and print its area.
 */
public class areaOfCircle {
    public static void main(String[] args) {
        area(4);
        area(10);
    }
    public static void area(int radius){
        int ar = (int)(3.14 *(radius*radius));
        System.out.println(ar);
    }
}
