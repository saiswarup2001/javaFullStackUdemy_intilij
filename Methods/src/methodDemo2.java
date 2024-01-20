public class methodDemo2 {
    public static void main(String[] args) {
        System.out.print("Rectangle with length = 12 and width = 2 and area = ");
        areaRectangle(12, 2);

        //method 1 of return type
//        int area = areaSquare(12);
//        System.out.print("Area of square is = "+ area);

        //method 2 of return type
        System.out.println("Area of square is = "+ areaSquare(12));
    }
    public  static  void areaRectangle(double length, double width){
        System.out.println(length*width);
    }

    public static  int areaSquare(int side){
        return side*side;
    }
}
