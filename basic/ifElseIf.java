public class ifElseIf {
    public static void main(String[] args) {
        int x = 5;
        int y = 3;
        //if else
        if(x == 5){
            System.out.println("value of x is 5");
        }else {
            System.out.println("value of x is not 5");
        }

        //if-elseif
        if(y != 5){
            System.out.println("value of y is not 5");
        } else if (y < 5) {
            System.out.println("value of y is less than 5");
        }else{
            System.out.println("value of y is 5");
        }
    }
}
