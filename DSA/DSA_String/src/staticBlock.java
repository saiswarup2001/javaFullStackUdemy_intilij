class Mobile1{
    static String name; // here name is a class
    String Brand;
    int price;

    //static block
    static {
        name = "Phone";
        System.out.println("this is Static block");
    }

    public Mobile1(){
        Brand = "";
        price = 200;
        System.out.println("This is constructor");
    }
    public void show(){
        System.out.println(name+ " : " + Brand+ " : "+price+ " : ");
    }

    //static method
}
//can be called using obj or using class name
public class staticBlock {
    public static void main(String[] args) throws ClassNotFoundException {

        Class.forName("Mobile1");
/*        //creation of object
        Mobile1 m1 = new Mobile1();
        m1.Brand ="Apple";
//        m1.name ="Android";
        Mobile1.name ="Android";
        m1.price = 15000;

//        m1.show();
*/
    }
}
