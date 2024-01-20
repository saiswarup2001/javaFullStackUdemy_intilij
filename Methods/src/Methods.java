public class Methods {
    public static void main(String[] args) {
        MyDetails();

        double topSpeed = SpeedofObj(150,120);
        System.out.println("Speed is : "+topSpeed);
    }

    public static  void MyDetails(){
        String MyName = "sai";
        int age = 21;
        double height = 5.11;
        System.out.println("My name is : "+MyName);
        System.out.println("Age is : "+age);
        System.out.println("Height is : "+height);
    }

    public static double SpeedofObj(double distance, double time) {
        if(distance >=100) {
            double speed = distance / time;
            return speed;
        }else{
            return  0;
        }
    }
}


/*What is a Method?
* A Method is a block of code or collection of statements or a set of
* code grouped together to perform a certain task or operation
*
* Methods are used to achieve the re-usability of code.
* Methods also provides the easy modification and readability of code.*/