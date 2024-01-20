public class methodOverloading {
    public static void main(String[] args) {
        System.out.println("Area of Rectangle: "+ area(14.25d, 10.65d));
        System.out.println("Area of square: "+ area(12));
        System.out.println("Area of square: "+ area(12.0d));
    }
    public static double area(double len, double wid){
        return len*wid;
    }
    public static int area( int side){
        return (side*side);
    }
    public static double area( double side){
        return  (side*side);
    }
}


// System.out.println("add x + y = "+ sum(10, 20));
//         System.out.println("add x + y = "+ sum(10, 20.24f));
//         System.out.println("add x + y = "+ sum(10.24d, 20.24d));
//
//
//public static int sum(int x, int y){
//        System.out.println("Add 2 int values: ");
//        return x+y;
//        }
//public static float sum(int x, float y){
//        System.out.println("Add int and a float values: ");
//        return (x+y);
//        }
//public static float sum(double x, double y){
//        System.out.println("Add 2 double values: ");
//        return (float)(x+y);
//        }