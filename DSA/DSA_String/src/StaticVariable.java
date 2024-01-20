class Mobile{
    static String name; // here name is a class
    String Brand;
    int price;

    public void show(){
        System.out.println(name+ " : " + Brand+ " : "+price+ " : ");
    }

    //static method
    public static void show1(Mobile obj){
        System.out.println(name+ " : " + obj.Brand+ " : "+obj.price+ " : ");
    }
}
//can be called using obj or using class name
public class StaticVariable {
    public static void main(String[] args) {

        //creation of object
        Mobile m1 = new Mobile();
        m1.Brand ="Apple";
//        m1.name ="Android";
        Mobile.name ="Android";
        m1.price = 15000;

        Mobile m2 = new Mobile();
        m2.Brand ="Redmi";
        m2.price = 18000;

        m1.show();
        m2.show();
        System.out.println("Static method");
        Mobile.show1(m1);
    }
}